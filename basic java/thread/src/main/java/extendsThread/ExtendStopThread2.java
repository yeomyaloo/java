package extendsThread;

public class ExtendStopThread2 {

    /**Thread 클래스를 확장하여 Thread를 구현했다.
     * 무한반복하며 Thread 상태를 출력하는 클래스**/
    static class Task extends Thread{
        int interval;

        Task(int interval){
            this.interval = interval;
        }

        @Override
        public void run() {
            System.out.printf("스레드 [ %s ]을 시작합니다.\n", Thread.currentThread().getName());

            while (!interrupted()){
                try{
                    System.out.printf("스레드 [ %s ] 동작중.\n", Thread.currentThread().getName());
                    Thread.sleep(this.interval);
                } catch (InterruptedException e) {
                    System.out.printf("스레드 [ %s ]에서 인터럽트가 발생하였습니다!\n", Thread.currentThread().getName());
                    stop2();
                }
            }
            System.out.printf("스레드 [ %s ]을 종료합니다.", Thread.currentThread().getName());
        }
        public void stop2(){
            interrupt();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Task task1 = new Task(1000);
        task1.start();

        Thread.sleep(5000);
        task1.interrupt();

        task1.join();

    }

}
