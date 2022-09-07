package six;

class BoundedBuffer {
    private final int[] buffer;
    private final int capacity;
    private int in, out;

    public BoundedBuffer(int size) {
        this.capacity = size;
        this.buffer = new int[capacity];
    }

    public synchronized void put(int product) {
        while (isFull()) {
            try {
                this.wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            buffer[in] = product;
            in = (in + 1) % capacity;
            System.out.println("생산됨: " + product);
            this.notify();
        }
    }

    public synchronized int take() {
        while (isEmpty()) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        int product = buffer[out];
        out = (out + 1) % capacity;
        System.out.println("소비됨: " + product);
        this.notify();
        return product;
    }
    public boolean isEmpty(){
            return in == out;
    }

    public boolean isFull(){
        return (in+1) % capacity == out;
    }
}

