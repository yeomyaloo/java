package one;

public class Example1_3 {
    static class Task extends Thread{
        private int interval;

        Task(int interval){
            this.interval = interval;
        }

        @Override
        public void run() {
            try {
                System.out.println("스레드 시작");
                while (!interrupted()){
                    Thread.sleep(this.interval);
                    System.out.println("동작중");

                }
            }catch (InterruptedException e){
                System.out.println("스레드 Interrupted 발생!");
            }
            System.out.println("스레드 종료");

        }
        public void stop2(){
            interrupt();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task thread= new Task(1000);

        thread.start();
        thread.sleep(3000);

        thread.stop2();

        //join을 쓰는 이유? -> 쓰레드가 terminate(끝난) 된 다음 제어권이 내게 넘어오는 것을 의미한다. (나머지가 쓰레드가 끝났는지 확인하는 개념 wait()와 같은 개념)
        thread.join();

    }
    
}
