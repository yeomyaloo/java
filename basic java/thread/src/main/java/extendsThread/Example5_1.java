package extendsThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Example5_1 {

    static class Task extends Thread{


        int interval;
        Lock lock;

        public Task(int interval) {
            this.interval = interval;
        }

        @Override
        public void run() {
            this.lock.lock();
            while (true){
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task task1 = new Task(3000);
        Task task2 = new Task(5000);

        task1.start();
        task2.start();

        task1.join();
    }

}
