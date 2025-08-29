package threadEx.sync;

import static util.ThreadUtils.sleep;
import static utilEx.MyLogger.log;

public class BankAccountV2 implements BankAccount {

    private int balance;

    public BankAccountV2(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public synchronized boolean withdraw(int amount) {//synchronized -> 동기화(동시에 스레드를 사용하지 않게 됨)
        log("거래 시작: " + getClass().getSimpleName());
        //잔고가 출금액보다 적으면, 진행x

        //====임계 영역 시작====
        log("[검증 시작] 출금액: " + amount + ", 잔액: " + balance);
        if (balance < amount) {
            log("[검증 실패] 출금액: " + amount + ", 잔액: " + balance);
            return false;
        }

        //잔고가 출금액보다 많으면 진행o
        log("[검증 완료] 출금액: " + amount + ", 잔액: " + balance);
        sleep(1000);//출금에 걸리는 시간
        balance = balance - amount;
        log("[출금 완료] 출금액: " + amount + ", 잔액: " + balance);
        //====임계 영역 종료====

        log("거래 종료: ");
        return false;
    }

    @Override
    public synchronized int getBalance() {
        return balance;
    }
}