package six;

public class Consumer implements Runnable{

    private final BoundedBuffer buffer;
    private final int iterations;

    public Consumer(BoundedBuffer buffer, int iterations) {
        this.buffer = buffer;
        this.iterations = iterations;
    }

    @Override
    public void run() {
        for(int i = 0; i < iterations; i++){
            buffer.take();
        }
    }
}
