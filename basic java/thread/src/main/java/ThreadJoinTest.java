import java.time.LocalDateTime;

public class ThreadJoinTest {

    public static class Task implements Runnable{
        String name;
        int loopCount;
        int maxLoopCount;
        int interval;

        public Task(String name, int interval , int maxLoopCount) {
            this.name = name;
            this.interval = interval;
            this.maxLoopCount = maxLoopCount;
        }

        public void incrementLoopCount() {
            ++this.loopCount;
        }

        public String getName() {
            return name;
        }

        public int getLoopCount() {
            return loopCount;
        }

        public int getMaxLoopCount() {
            return maxLoopCount;
        }

        public int getInterval() {
            return interval;
        }

        @Override
        public void run() {
            System.out.printf("[ %s ] : %s가(이) 시작되었습니다.", LocalDateTime.now(),this.getName());
            try {
                while (this.getLoopCount() < this.getMaxLoopCount()) {
                    Thread.sleep(this.getInterval());
                    this.incrementLoopCount();
                    System.out.printf("[ %s ] : %s이 %d번째 실행되었습니다.\n", LocalDateTime.now(), this.getName(), this.getLoopCount());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("[ %s ] : %s가(이) 종료되었습니다.", LocalDateTime.now(),this.getName());
        }

        public static void main(String[] args) throws InterruptedException {
            Thread thread = new Thread(new Task("one", 1000, 3));
            System.out.printf("[ %s ] :main에서 쓰레드를 시작합니다. \n", LocalDateTime.now());
            thread.start();
            System.out.printf("[ %s ] :main에서 쓰레드가 종료되길 기다립니다. \n", LocalDateTime.now());
            thread.join();
            System.out.printf("[ %s ] :%s가 종료되었습니다. \n", LocalDateTime.now(),Thread.currentThread().getName());

        }


    }
}
