package Practice_07022025;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ConcurrencyDemo3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<String> cFuture = CompletableFuture.supplyAsync(() -> {
            IntStream.rangeClosed(0, 9).forEach((i) -> System.out.println("Supply Async " + i));
            return "Completed Execution";
        });
        CompletableFuture.runAsync(() -> {
            IntStream.rangeClosed(0, 9).forEach((i) -> System.out.println("Run Async " + i));
        });
        CompletableFuture<Double> cf1 = CompletableFuture.supplyAsync(() -> {
            IntStream.rangeClosed(0, 9).forEach((i) -> System.out.println("Supply Async " + i));
            double res = IntStream.range(1, 101).sum();
            return res;
        });
        // System.out.println(cFuture.get());
        // Thread.sleep(1000);
        CompletableFuture<Void> f = CompletableFuture.allOf(cf1, cFuture);
        // f.get();
        // f.join();
        cf1.thenApplyAsync((x) -> {
            System.out.println("Summing till 100 is " + x);
            return x;
        });
        CompletableFuture<String> cFutureWithTimeOut = CompletableFuture.supplyAsync(() -> {
            IntStream.rangeClosed(0, 9).forEach((i) -> System.out.println("Supply Async " + i));
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "Completed Execution";
        }).orTimeout(1, TimeUnit.SECONDS).exceptionally(s -> "Session timed out");
        System.out.println(cFutureWithTimeOut.get());
        System.out.println(cFutureWithTimeOut.getNow("Print this if absent"));
        Thread.sleep(1000);
        cf1.thenApply((x) -> {
            System.out.println("Summing till 100 is " + x);
            return x;
        });
    }
}
