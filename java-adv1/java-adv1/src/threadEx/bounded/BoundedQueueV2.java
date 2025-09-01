package threadEx.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static util.ThreadUtils.sleep;
import static utilEx.MyLogger.log;

public class BoundedQueueV2 implements BoundedQueue {

    private final Queue<String> queue=  new ArrayDeque<>(); //Queue에는 Array가 베스트
    private final int max;

    public BoundedQueueV2(int max) {
        this.max = max;

    }

    @Override
    public synchronized void put(String data) {
        while (queue.size() == max) {
            log("[put] 큐가 가득 참, 생산자 대기");
            sleep(1000);
        }
        queue.offer(data); //offer : 값 넣기
    }

    @Override
    public synchronized String take() {
        while(queue.isEmpty()) {
            log("[take] 큐에 데이터가 없음, 소비자 대기");
            sleep(1000);
        }
        return queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
