package threadEx.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static util.ThreadUtils.sleep;
import static utilEx.MyLogger.log;

public class BoundedQueueV3 implements BoundedQueue {

    private final Queue<String> queue=  new ArrayDeque<>(); //Queue에는 Array가 베스트
    private final int max;

    public BoundedQueueV3(int max) {
        this.max = max;

    }

    @Override
    public synchronized void put(String data) {
        while (queue.size() == max) {
            log("[put] 큐가 가득 참, 생산자 대기");
            try {
                wait(); //Runnable -> Waitting, 락 반납
                log("[put] 생산자 깨어남");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.offer(data); //offer : 값 넣기
        log("[put] 생산자 데이터 저장, notify() 호출");
        notify(); // 대기 스레드, wait -> blocked
    }

    @Override
    public synchronized String take() {
        while(queue.isEmpty()) {
            log("[take] 큐에 데이터가 없음, 소비자 대기");
            try {
                wait();
                log("[take] 소비자 깨어남");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String take = queue.poll();
        log("[take] 소비자 데이터 획득, notify() 호출");
        notify(); //대시 스테스, wait -> blocked
        return take;
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
