package implementsThread;

public class RunnableThread3 {
    static class Task implements Runnable{
        int interval;
        Task(int interval){
            this.interval = interval;
        }

        @Override
        public void run() {
            System.out.println("스레드 - [ %s ]을 시작합니다.");
            while (true){
                System.out.println("스레드 - [ %s ] 실행 중");
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {

                    Thread.currentThread().interrupt();
                    System.out.println("스레드 - [ %s ] dasasd 중");

                }

            }
            System.out.println("스레드 - [ %s ] 실행 중");
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
