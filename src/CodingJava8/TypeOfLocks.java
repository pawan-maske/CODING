package CodingJava8;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TypeOfLocks {

    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " trying to withdraw amount");
        try {
            if (lock.tryLock(4000, TimeUnit.MILLISECONDS)) {
                if(balance>=amount){
                    try {
                        System.out.println(Thread.currentThread().getName() + " withdraw started");
                        Thread.sleep(3000);
                        balance-=amount;
                        System.out.println(Thread.currentThread().getName() + " withdrawal completed");
                    } catch (InterruptedException e) {

                    } finally {
                        lock.unlock();
                    }
                }else{
                    System.out.println(Thread.currentThread().getName() + " cannot withdraw due to low balance");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " Waiting for lock");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
