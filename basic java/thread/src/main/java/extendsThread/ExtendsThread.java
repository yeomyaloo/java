package extendsThread;

public class ExtendsThread extends Thread{
    private String message;
    private int loopCount;

    public ExtendsThread(String message){
        this.message = message;
        this.loopCount = 0;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()){
            try{
                ++this.loopCount;
                System.out.println(this.message +" : "+ this.loopCount);
                Thread.sleep((long)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ExtendsThread thread1 = new ExtendsThread("one");
        ExtendsThread thread2 = new ExtendsThread("one");
        ExtendsThread thread3 = new ExtendsThread("three");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
