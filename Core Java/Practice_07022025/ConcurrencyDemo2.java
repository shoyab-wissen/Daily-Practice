package Practice_07022025;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class ConcurrencyDemo2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        es.submit(new Greet());
        Future<Integer> f1 = es.submit(new Sum(20));
        Future<Integer> f2 = es.submit(new Sum(5));
        Future<Integer> f3 = es.submit(new Sum(100));

        System.out.println("Sum(20) " + f1.get());
        System.out.println("Sum(5) " + f2.get());
        System.out.println("Sum(100) " + f3.get());

        es.shutdown();
    }
}

class Greet implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        IntStream.range(0, 5).forEach(i -> System.out.println("Konichiva: " + i));
    }
}

class Sum implements Callable<Integer> {
    private int num;

    Sum(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        return IntStream.rangeClosed(1, num).sum();
    }

}