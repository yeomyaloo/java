import java.time.LocalDateTime;


//잠에들고 해당 시간이지나면 다시 잠에 깨어나고를 무한 반복하는 코드
public class ThreadSleepTest {

    static class Task extends Thread{
        @Override
        public void run() {
            System.out.println("[ "+ LocalDateTime.now()+"]" +
                    Thread.currentThread().getName()+": 시작");
            while(true){
                try{
                    System.out.println("[ "+ LocalDateTime.now()+"]" +
                            Thread.currentThread().getName()+": 잠에 듭니다.");
                    Thread.sleep(3000);
                    System.out.println("[ "+ LocalDateTime.now()+"]" +
                            Thread.currentThread().getName()+": 잠에서 깨어 납니다.");
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("[ "+ LocalDateTime.now()+"]" +
                    Thread.currentThread().getName()+": 종료");

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task task1 = new Task();
        task1.start();
        task1.join();
    }
}
