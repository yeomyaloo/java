package six;

public class Producer implements Runnable{
    private final BoundedBuffer buffer;
    private final int iterations;

    public Producer(BoundedBuffer buffer, int iterations){
        this.buffer = buffer;
        this.iterations = iterations;
    }
    @Override
    public void run() {
        for(int i = 1; i<=iterations; i++){
            buffer.put(i);
        }
    }
}
