package six;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BoundedBuffer buffer = new BoundedBuffer(10);
        int iterations = 30;

        Thread producer = new Thread(new Producer(buffer, iterations));
        Thread consumer = new Thread(new Consumer(buffer, iterations));

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();

        System.out.println("프로그램을 종료합니다.");

        /**
         * 버퍼의 크기는 10, 생산자 소비자는 각각 30번 만큼 생산과 소비를 반복
         * 이때는 반복횟수를 올기게 되면 문제 발생 (순환 큐를 사용했기 때문)
         * **/
    }
}
