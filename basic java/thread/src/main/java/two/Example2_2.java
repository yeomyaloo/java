package two;

public class Example2_2 {
    static class Task extends Thread implements Runnable{
        int interval;
        Task childInterval;
        Thread thread;
        public Task(int interval, int childInterval) {
            this.interval = interval;
            this.childInterval = new Task(childInterval);
        }

        public Task(int interval) {
            this.interval = interval;
            this.thread = new Thread(this);
        }



        public void start(){
            this.thread = new Thread(this);
            this.thread.start();
        }

        @Override
        public void run() {
            System.out.println("스레드 시작");
            while (true){
                try {
                    Thread.sleep(this.interval);
                    System.out.println("스레드 동작 중");
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
//별도의 Thread 객체 생성 없이 바로 시작?
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task(1000,2000);
        task.start();
        Thread.sleep(5000);
        task.interrupt();
        task.join();

    }
}
