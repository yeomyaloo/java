package two;

public class Example2_1 {

    static class Task implements Runnable{
        int interval;

        public Task(int interval) {
            this.interval = interval;
        }

        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(this.interval);
                    System.out.println("동작 중");
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }

        public void stop() {
        }
    }

    /**Runnable을 사용할 경우 관리를 할 객체가 하나 더 늘어나게 된다.
     이런 경우엔 관리를 어떻게 해야 할지를 생각해야 한다.
     관리 포인트가 여러개인 것보다 더 적은게 낫다.
     시작 - thread
     stop - runnable
     여러개로 고려해야한다.
     **/
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task(1000);
        Thread taskThread = new Thread(task);
        taskThread.start();
        Thread.sleep(5000);
        task.stop();
        taskThread.join();
    }
}
