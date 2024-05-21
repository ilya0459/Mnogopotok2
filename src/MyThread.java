
import java.util.concurrent.Callable;

public class MyThread implements Callable<Integer> {
    private Integer count = 0;
    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        System.out.println("Я " + Thread.currentThread().getName() + ". Всем привет!");
        count++;
        return count;
    }
}