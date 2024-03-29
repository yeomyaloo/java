package extendsThread;

public class ExtendStopThread {

    /**Thread 클래스를 확장하여 Thread를 구현했다.
     * 무한반복하며 Thread 상태를 출력하는 클래스**/
    static class Task extends Thread{
        int interval;
        boolean isStop;
        Task(int interval){
            this.interval = interval;
            this.isStop = false;
        }

        @Override
        public void run() {
            while (true){
                try{
                    System.out.println(Thread.currentThread().getName() + " - 현재 실행중");
                    Thread.sleep(this.interval);
                } catch (InterruptedException e) {

                }
            }
        }


        public void stop2() throws InterruptedException {
            this.isStop= true;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task task1 = new Task(1000);


        task1.start();

        Thread.sleep(5000);

        task1.stop2();
        task1.join();

    }

}
