package CodingJava8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main5 {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i < 10; i++) {
            int val = i;
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " "+val+1000);
            });

        }
        executor.shutdown();

    }
}
