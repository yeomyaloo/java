package extendsThread;

public class Example4 {

    static class Task extends Thread{
        int interval;

        public Task(int interval) {
            this.interval = interval;
        }

        @Override
        public void run() {
            Thread.
            while(){


            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task task1 = new Task(3000);
        Task task2 = new Task(5000);

        task1.start();
        task2.start();

        long startTime = System.currentTimeMillis();
        long previousPrintTime = 0;

        for (int i = 0; i < 100 ; i ++){
            Thread.sleep(1000);
            if(i%2 == 0){
                task1.interrupt();
                task2.interrupt();
            }
            long totalElapsedTime = System.currentTimeMillis() - startTime;
            long elapsedTime = totalElapsedTime - previousPrintTime;

            System.out.printf("[ %02d:%02d.%03d ][ %02d.%03 ] %s - %s\n",
                    totalElapsedTime/(60*1000), (totalElapsedTime/1000) %60,
                    totalElapsedTime % 1000, (elapsedTime/1000), elapsedTime%1000,
                    (elapsedTime/1000), elapsedTime%1000,
                    task1.getState(), task2.getState());
            previousPrintTime = totalElapsedTime;

        }

    }
}
