package thread.cas.increment;

import java.util.concurrent.atomic.AtomicInteger;

import static utilEx.MyLogger.log;

public class CasMainV2 {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("start value = " +  atomicInteger.get());

        int result = atomicInteger.incrementAndGet();
        System.out.println("result = " + result);

        //incrementAndGet 구현
        int resultValue1 = incrementAndGet(atomicInteger);
        System.out.println("resultValue1 = " + resultValue1);

        int resultValue2 = incrementAndGet(atomicInteger);
        System.out.println("resultValue2 = " + resultValue2);
    }

    private static int incrementAndGet(AtomicInteger atomicInteger) {
        int getValue;
        boolean result;
        do {
            getValue = atomicInteger.get();
            log("getValue = " + getValue);
            result = atomicInteger.compareAndSet(getValue, getValue + 1);// 처음에 읽은것과 연산시 읽은 값이 다를경우 진행 x
            log("result = " + result);
        } while (!result);
        return getValue + 1;
    }
}
