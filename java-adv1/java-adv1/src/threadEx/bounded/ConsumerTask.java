package threadEx.bounded;

import thread.bounded.BoundedQueue;

import static utilEx.MyLogger.log;

public class ConsumerTask implements Runnable {

    private BoundedQueue queue;

    public ConsumerTask(BoundedQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        log("[소비 시도]     ?  <- " + queue);
        String data = queue.take(); //queue.take : 데이터를 가지고 나옴
        log("[소비 완료] " + data + " <- " + queue);
    }
}
