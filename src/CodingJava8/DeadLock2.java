package CodingJava8;

public class DeadLock2 {

    public static void main(String[] args) {

    Object obj1 = new Object();
    Object obj2 = new Object();
    Thread t1 = new Thread(() -> {
        synchronized (obj1) { // t1 locks obj1 first
            System.out.println("obj1 lock acquired by t1");
            try {
                System.out.println("t1 sleep start");
                Thread.sleep(1000); // Small sleep to ensure t2 gets a chance to lock obj2
                System.out.println("t1 sleep end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (obj2) { // t1 tries to lock obj2 next
                System.out.println("obj2 lock acquired by t1");
            }
        }
    });

    Thread t2 = new Thread(() -> {
        synchronized (obj2) { // t2 locks obj2 first
            System.out.println("obj2 lock acquired by t2");
            try {
                System.out.println("t2 sleep start");
                Thread.sleep(1000); // Small sleep to ensure t1 gets a chance to lock obj1
                System.out.println("t2 sleep end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (obj1) { // t2 tries to lock obj1 next
                System.out.println("obj1 lock acquired by t2");
            }
        }
    });

        t1.start();
        t2.start();

}
}


