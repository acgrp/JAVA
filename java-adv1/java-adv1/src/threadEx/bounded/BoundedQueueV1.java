package threadEx.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static utilEx.MyLogger.log;

public class BoundedQueueV1 implements BoundedQueue {

    private final Queue<String> queue=  new ArrayDeque<>(); //Queue에는 Array가 베스트
    private final int max;

    public BoundedQueueV1(int max) {
        this.max = max;

    }

    @Override
    public synchronized void put(String data) {
        if (queue.size() == max) {
            log("[put] 큐가 가득 참, 버림 :" + data);
            return;
        }

        queue.offer(data); //offer : 값 넣기
    }

    @Override
    public synchronized String take() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
