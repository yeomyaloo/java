package implementsThread;

public class RunnableThread implements Runnable{
    private String message;
    private int loopCount;

    public RunnableThread(String message){
        this.message= message;
        this.loopCount = 0;
    }

    @Override
    public void run() {
        while (Thread.interrupted()) {
            try {
                ++this.loopCount;
                System.out.println(message + " : " + this.loopCount);
                Thread.sleep((long)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableThread("one"));
        Thread thread2 = new Thread(new RunnableThread("one"));
        Thread thread3 = new Thread(new RunnableThread("three"));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
