package extendsThread;public class ExtendThread {

    /**Thread 클래스를 확장하여 Thread를 구현했다.
     * 무한반복하며 Thread 상태를 출력하는 클래스**/
    static class Task extends Thread{
        int interval;
        Task(int interval){
            this.interval = interval;
        }

        @Override
        public void run() {
            while (true){
                try{
                    System.out.println(Thread.currentThread().getName() + " - 현재 실행중");
                    Thread.sleep(this.interval);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task task1 = new Task(2000);
        Task task2 = new Task(3000);

        task1.start();
        task2.start();

        for(int i = 0; i < 100; i++){
            System.out.printf("%s : %s - %s : %s\n", task1.getName(),task1.getState(), task2.getName(),task2.getState());
            Thread.sleep(1000);


        }

    }

}
