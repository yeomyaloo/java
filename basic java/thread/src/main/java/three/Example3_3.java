package three;

public class Example3_3 extends Thread {

    public Example3_3(String name){
        super(name);
    }

    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println(getName()+"is Daemon thread");
        }else {
            System.out.println(getName() + " is User thread");
        }
    }

        public static void main(String[] args) {
            Example3_3 t1 = new Example3_3("t1");
            Example3_3 t2 = new Example3_3("t2");
            Example3_3 t3 = new Example3_3("t3");

            t1.setDaemon(true);
            t1.start();
            t2.start();

            t3.setDaemon(true);
            t3.start();
        }
    }

