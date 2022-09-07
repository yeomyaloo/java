package one;

public class Example1_3_2 {
    static class Task extends Thread{
        private int interval;

        Task(int interval){
            this.interval = interval;
        }

        @Override
        public void run() {
            try {
                System.out.println("스레드 시작");
                while (true){
                    Thread.sleep(this.interval);
                    System.out.println("동작중");

                }
            }catch (InterruptedException e){
                System.out.println("스레드 Interrupted 발생!");
            }
            System.out.println("스레드 종료");

        }

    }

    public static void main(String[] args) throws InterruptedException {
        Task thread= new Task(1000);

        thread.start();
        thread.sleep(5000);

        thread.interrupt();
        thread.join();

    }
    
}
