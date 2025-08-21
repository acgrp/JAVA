package threadEx.start;

import static utilEx.MyLogger.log;

public class InnerRunnableMainV4 {
    public static void main(String[] args) {
        log("main() start");


        //컨+알+n
        Thread thread = new Thread(() -> log("run() "));
        thread.start();

        log("main() end");

    }

}
