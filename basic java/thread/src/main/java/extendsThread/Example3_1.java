package extendsThread;

public class Example3_1 {
    static class Task extends Thread {
        int interval;
        Thread thread;
        int childInterval;


        public Task(int interval, int childInterval) {
            this.interval = interval;
            this.thread = new Thread();
            this.childInterval = childInterval;
        }

        @Override
        public synchronized void start() {
            thread.start();

        }

        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("현재 스레드 : " + Thread.currentThread().getName());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Task task = new Task(200, 1000);
        task.start();
        Thread.sleep(10000);
        task.stop();
        task.join();
    }
}
