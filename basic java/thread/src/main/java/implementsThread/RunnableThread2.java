package implementsThread;

public class RunnableThread2 {
    static class Task implements Runnable{
        int interval;
        Task(int interval){
            this.interval = interval;
        }

        @Override
        public void run() {
            while (true){
                System.out.printf("스레드 - [ %s ] 실행 중\n", Thread.currentThread().getStackTrace());
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }


        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task task = new Task(1000);
        Thread thread = new Thread(task);
        Thread threadTask = new Thread(new Task(1000));
//        thread.start();
//        Thread.sleep(5000);
//        task.stop();
//
//        thread.join();


        threadTask.start();
        Thread.sleep(5000);
        threadTask.stop();
        threadTask.join();
    }
}
