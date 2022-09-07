package three;

public class Example3_1 {

    static class Task extends Thread{
        Thread t1;

        int interval;
        int interval2;

        public Task(int interval, int interval2) {
            this.interval = interval;
            this.interval2 = interval2;
            t1 = new Thread(String.valueOf(this.interval2));
        }

        @Override
        public void run() {
            while(true){
                try{
                    System.out.println("동작");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task task =new Task(2000, 1000);
        task.start();
        Thread.sleep(10000);
        task.stop();
        task.join();
    }
}
