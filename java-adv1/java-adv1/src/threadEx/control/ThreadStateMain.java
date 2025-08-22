package threadEx.control;

import static utilEx.MyLogger.log;

public class ThreadStateMain {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable(), "myRunnable");
        log("myThread.state1 = " + thread.getState());
        log("myThread.start()");
        thread.start();
        Thread.sleep(1000);
        log("myThread.state3 = " + thread.getState());//sleep이면 본인이 본인을 확인불가
        Thread.sleep(4000);
        log("myThread.state5 = " + thread.getState());//sleep이면 본인이 본인을 확인불가
        log("end");
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            try {
                log("start");
                log("myThread.state2 = " + Thread.currentThread().getState());
                log("sleep() start");
                Thread.sleep(3000);
                log("sleep() end");
                log("myThread.state4 = " + Thread.currentThread().getState());
                log("end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
