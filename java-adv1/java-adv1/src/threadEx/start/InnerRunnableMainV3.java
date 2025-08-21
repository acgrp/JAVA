package threadEx.start;

import static utilEx.MyLogger.log;

public class InnerRunnableMainV3 {
    public static void main(String[] args) {
        log("main() start");


        Thread thread = new Thread(new Runnable() {//컨+알+n
            @Override
            public void run() {
                log("run() ");
            }
        });
        thread.start();

        log("main() end");

    }

}
