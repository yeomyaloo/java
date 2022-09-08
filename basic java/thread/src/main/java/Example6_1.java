import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example6_1 {


    static  class Producer implements Runnable{
        String []apple;
        int interval;
        Market market;

        public Producer(Market market, String apple, int interval) {
            this.market = market;

            this.interval = interval;
        }


        @Override
        public void run() {
            while (true){
                try {
                    market.get();
                    Thread.sleep(this.interval);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class Consumer implements Runnable {
        int interval;
        String []product;

        Market market;



        public Consumer(Market market, String[] product, int interval, int i1) {
            this.product = product;
            this.market = market;
            this.interval = interval;

        }

        @Override
        public void run() {

            while (true){
                try {
                    market.put(String.valueOf(this.product));
                    Thread.sleep(this.interval);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    static class Market{

        private final int capacitive;
        private final String[] buffer;
        private int in, out;
        private Lock lock;
        public Market(int size) {
            this.capacitive = size;
            this.buffer = new String[this.capacitive];
            this.in = 0;
            this.out = 0;
        }

        public void put(String product){
            this.lock.lock();
            System.out.println(Thread.currentThread().getName()+"에서 apple을 납품합니다.");
            while (isFull()){
                try{
                    System.out.println("현재 매대가 가득 찼습니다.");
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            buffer[in] = product;
            in = (in+1) % capacitive;
            this.lock.unlock();
            this.notify();
            System.out.println("현재 재고는 "+buffer.length+"개 입니다.");
        }

        public String get(){
            this.lock.lock();
            System.out.println(Thread.currentThread().getName()+"가 apple을 구매하길 원합니다.");
            while (isEmpty()) {
                try {
                    System.out.println("현재 재고가 없습니다.");
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            String value = buffer[out];
            buffer[out] = null;
            out = (out - 1) % capacitive;
            this.lock.unlock();
            this.notify();
            System.out.println("현재 재고는 "+buffer.length+"개 입니다.");
            return value;
        }

        private boolean isEmpty() {
            return in == out;
        }

        private boolean isFull() {
            return out == capacitive;
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Market market = new Market(10);
        Thread producer = new Thread(new Producer(market, "apple", 3000));
        Thread consumer = new Thread(new Consumer(market, new String[] {"apple"}, 1000,4000));

        producer.start();
        consumer.start();

        while(true){
            Thread.sleep(1000);
        }

    }

}
