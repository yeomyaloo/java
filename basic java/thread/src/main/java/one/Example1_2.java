package one;

public class Example1_2 {
    static class Task extends Thread{
        int loopCount;
        private boolean stopFlag;
        private int interval;

        Task(int interval){
            this.interval = interval;
        }

        @Override
        public void run() {
            this.stopFlag = false;
            try {
                System.out.println("스레드 시작");
                while (!this.stopFlag){
                    Thread.sleep(this.interval);
                    System.out.println("동작중");
                }
            }catch (InterruptedException e){
                System.out.println("ㅅ레드 인터럽트 발생");
            }finally {
                this.stopFlag = stopFlag;
            }
            System.out.println("스레드 종료");

        }

        /**
         * 해당 메소드는 필드를 추가해서 작업을 진행하는 방식이다.
         * 이 방식이 좋지 않은 이유는 쓰레드를 바로 멈추고 싶을 때 멈춰지지 않고
         * 밀리는 등의 문제가 생기기 때문이다. (중간 작업을 모두 처리하고 중지가 된다.)
         *
         * 긴급중지에는 처리가 불가능하다는 치명적 단점
         * **/

        public boolean stop2() {
            return this.stopFlag = true;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task thread= new Task(1000);

        thread.start();


        thread.stop2();
        thread.join();

    }
    
}
