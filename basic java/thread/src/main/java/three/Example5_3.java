package three;

public class Example5_3 {

    static class Printer{

        private String message;
        private long interval;

        public Printer() {
        }

        Printer(String message){
            this.message = message;
            this.interval = interval;
        }

        synchronized public void printer(String msg) throws InterruptedException {
            System.out.println(message.toString());
            Thread.sleep(interval);
        }


    }

    static class Task extends Thread{

        String msg;
        int interval;
        Printer printer;

        public Task(int interval, Printer printer) {
            this.interval = interval;
            this.printer = new Printer(msg);
        }

        @Override
        public void run() {
            synchronized (printer){
                try {
                    printer.printer(msg);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }


        public void stop2() {
                interrupt();
            }
        }


    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();

        Task task1 = new Task(3000, printer);
        Task task2 = new Task(5000, printer);

        task1.start();
        task2.start();

        long startTime = System.currentTimeMillis();
        long previousPrintTime = 0;

        for(int i = 0; i < 100; i++){
            Thread.sleep(1000);
            if(i%2 == 0){
                task1.interrupt();
                task2.interrupt();
            }

            long totalElapsedTime = System.currentTimeMillis() - startTime;
            long elapsedTime = totalElapsedTime - previousPrintTime;
            System.out.printf("[ %02d:%02d.%03d ][ %02d.%03d ] %s - %s\n",
                    totalElapsedTime / (60 * 1000), (totalElapsedTime / 1000) % 60,
                    totalElapsedTime % 1000,
                    (elapsedTime / 1000), elapsedTime % 1000,
                    task1.getState(), task2.getState());
            previousPrintTime = totalElapsedTime;
        }
        task1.stop2();
        task1.stop2();

    }

}
