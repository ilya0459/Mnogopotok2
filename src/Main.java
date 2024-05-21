import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread thread = new MyThread();

        ExecutorService pool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        Future future = null;

        for (int i = 0; i < 13; i++) {
            future = pool.submit(thread);
        }

        pool.shutdown();

        System.out.println("Всего выведено на консоль: " + future.get());

    }
}