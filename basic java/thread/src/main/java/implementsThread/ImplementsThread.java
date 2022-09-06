package implementsThread;

import extendsThread.ExtendsThread;

public class ImplementsThread implements Runnable{
    private String message;
    private int loopCount;

    public ImplementsThread(String message) {
        this.message = message;
        this.loopCount = 0;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()){
            try {
                ++this.loopCount;
                System.out.println(message + " : " + this.loopCount);
                Thread.sleep((long)(Math.random()*1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
