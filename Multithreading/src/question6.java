import java.util.concurrent.*;

public class question6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        System.out.println("Thread starting: " + Thread.currentThread().getName());
        Future<Integer> futureOne;
        try {
            futureOne = executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() {
                    try {
                        Thread.sleep(3000L);
                        System.out.println("Thread 1");
                    } catch (InterruptedException e) {
                        // e.printStackTrace();
                    }
                    return 2;
                }
            });
        } finally {
            executorService.shutdownNow();
        }
        // futureOne.cancel(true);
        if (futureOne.isDone())
            System.out.println("Value in Future object: " + futureOne.get().toString());
        if (futureOne.isCancelled())
            System.out.println("Task was cancelled");
        System.out.println("Thread exiting: " + Thread.currentThread().getName());
    }
}
