package CodingJava8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CodeRentrantLock {

    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try {
            System.out.println("OuterMethod");
            innerLock();
        } finally {
            lock.unlock();
        }
    }

    private void innerLock() {
        lock.lock();
        try{
            System.out.println("InnerMethod");

        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        CodeRentrantLock code = new CodeRentrantLock();
        code.outerMethod();
    }

}
