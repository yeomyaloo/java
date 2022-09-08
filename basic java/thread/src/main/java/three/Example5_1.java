package three;


/**
 * lock은 공유를 해야하고 코드 내에서 보인다고 다 lock되는 것이 아니다.
 * **/
public class Example5_1 {

    static class Task extends Thread{
        Task lock;
        long interval;
        public Task(long interval) {
            this.interval = interval;
            this.lock = new Task(this.interval);
        }




        @Override
        public void run() {

            long startTime = System.currentTimeMillis();
            long previousPrintTime = 0;
            long targetTime = startTime + this.interval;


            while (true) {
                while (System.currentTimeMillis() < targetTime) {
                }
                try {

                    Thread.sleep(this.interval);
                    long totalElapsedTime = System.currentTimeMillis() - startTime;
                    long elapsedTime = totalElapsedTime - previousPrintTime;
                    System.out.printf("[ %02d:%02d.%03d ][ %02d.%03d ]\n",
                            totalElapsedTime / (60 * 1000), (totalElapsedTime / 1000) % 60,
                            (elapsedTime / 1000), elapsedTime % 1000,
                            Thread.currentThread().getName());

                    previousPrintTime = totalElapsedTime;
                } catch (InterruptedException e) {
                }
                targetTime = targetTime + this.interval;

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
}
