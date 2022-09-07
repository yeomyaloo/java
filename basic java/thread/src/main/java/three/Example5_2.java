package three;


import java.util.concurrent.locks.Lock;

public class Example5_2 {

    static class Task extends Thread{
        Lock lock;
        long interval;
        public Task(long interval) {
            this.interval = interval;
            this.lock = new Lock(this.interval) {
            };
        }

        @Override
        public void run() {
                try {
                    long startTime = System.currentTimeMillis();
                    long previousPrintTime = 0;
                    lock.lock();
                    Thread.sleep(this.interval);
                    lock.unlock();
                    Thread.yield();
                    long totalElapsedTime = System.currentTimeMillis() - startTime;
                    long elapsedTime = totalElapsedTime - previousPrintTime;
                    System.out.printf("[ %02d:%02d.%03d ][ %02d.%03d ]\n",
                            totalElapsedTime / (60 * 1000), (totalElapsedTime / 1000) % 60,
                            (elapsedTime / 1000), elapsedTime % 1000,
                            Thread.currentThread().getName());
                    previousPrintTime = totalElapsedTime;
                } catch (InterruptedException e) {

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task task1 =new Task(3000);
        Task task2 =new Task(5000);

        task1.start();
        task1.start();

        task1.join();
    }
}
