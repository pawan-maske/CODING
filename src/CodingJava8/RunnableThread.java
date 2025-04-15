package Coding2AdvancedJava;

public class RunnableThread implements Runnable {
    private final Object obj1;
    private final Object obj2;

    public RunnableThread(Object obj1, Object obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    @Override
    public void run() {
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
    }
}
