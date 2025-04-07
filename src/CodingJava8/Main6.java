package CodingJava8;

public class Main6 {
    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run operation performed by Thread Name" + Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

    }
}
