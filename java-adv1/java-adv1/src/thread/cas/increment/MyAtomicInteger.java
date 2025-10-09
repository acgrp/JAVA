package thread.cas.increment;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomicInteger implements incrementInteger {

    AtomicInteger atomicInteger = new AtomicInteger(0); //멀티스레드를 위한 코드들이 구현 되어있음

    @Override
    public void increment() {
        atomicInteger.incrementAndGet(); //값 증가 반환
    }

    @Override
    public int get() {
        return atomicInteger.get();
    }
}
