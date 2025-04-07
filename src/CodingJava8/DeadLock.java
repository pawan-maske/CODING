package CodingJava8;

public class DeadLock {
    public static void main(String[] args) {
    Object obj1 = new Object();
    Object obj2 = new Object();

    Thread t2 = new Thread(()->{
        synchronized (obj1){
            System.out.println("obj2 lock acquired by t2");
            try {
                System.out.println("t2 sleep start");
                Thread.sleep(3000);
                System.out.println("t2 sleep end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (obj2){
                System.out.println("obj1 lock acquired by t2");
            }
        }

    });

    Thread t1 = new Thread(()->{
        synchronized (obj2){
            System.out.println("obj1 lock acquired by t1");
            try {
                System.out.println("t1 sleep start");
                Thread.sleep(3000);
                System.out.println("t1 sleep end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (obj1){
                System.out.println("obj2 lock acquired by t1");
            }
        }

    });

    t2.start();
    t1.start();

    }


}
