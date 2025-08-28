package threadEx.volatile1;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class Volatile1 {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");
        log("runFlag = " + task.runFlag);
        t.start();

        sleep(1000);
        log("runFlag를 false로 변경 시도");
        task.runFlag = false;
        log("runFlag = " + task.runFlag);
        log("main 종료");
    }

    static class MyTask implements Runnable {

//        boolean runFlag = true;
        volatile boolean runFlag = true; //캐시 메모리에서 사용하던걸 메인으로 지정 (성능저하, 오류감소)

        @Override
        public void run() {
            log("task 시작");

            while (runFlag) {
                //runFlag가 false로 변하면 탈출
            }
            log("task 종료");
        }
    }
}
