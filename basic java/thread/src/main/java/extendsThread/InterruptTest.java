package extendsThread;

public class InterruptTest {
    static class Task extends Thread {
        public void run() {
            System.out.println("start");
            try {
                while (true) {
                    System.out.println("running!");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupt occurred!!");
            }

            System.out.println("finished");
        }
    }
    public static void main(String[] args) {
        Thread thread = new Task();

        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        //3초 뒤 interrupt 발생
        thread.interrupt();
    }

}

