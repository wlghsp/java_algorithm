package java_study.thread;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.*;

class MyThreadTest {

    @Test
    void threadStart() {
        Thread thread = new MyThread();
        thread.start();

        System.out.println("Hello: " + Thread.currentThread().getName());

    }

    @Test
    void threadRun() {
        Thread thread = new MyThread();
        thread.run();
        thread.run();
        thread.run();
        System.out.println("Hello: " + Thread.currentThread().getName());
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread: " + Thread.currentThread().getName());
        }
    }


    @Test
    void futureTest() throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callable = () -> {
            Thread.sleep(3000L);
            return "Thread: " + Thread.currentThread().getName();
        };

        // It takes 3 seconds by blocking(블로킹에 의해 3초 걸림)
        Future<String> future = executorService.submit(callable);

        System.out.println(future.get());

        executorService.shutdown();
    }


    @Test
    void executorRun() {
        final Runnable runnable = () -> System.out.println("Thread: " + Thread.currentThread().getName());

        Executor executor = new RunExecutor();
        executor.execute(runnable);
    }


    static class RunExecutor implements Executor {
        @Override
        public void execute(Runnable command) {
            new Thread(command).start();
        }
    }

    @Test
    void shutdown() {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Runnable runnable = () -> System.out.println("Thread: " + Thread.currentThread().getName());
        executorService.execute(runnable);

        // shutdown 호출
        executorService.shutdown();

        // shutdown 호출 이후에는 새로운 작업들을 받을 수 없음, 에러 발생
        RejectedExecutionException result = assertThrows(RejectedExecutionException.class, () -> executorService.execute(runnable));
        Assertions.assertThat(result).isInstanceOf(RejectedExecutionException.class);

    }
}