import java.util.ArrayList;

public class MyQueue <T> {
    private ArrayList<T> queue;

    private int maxsize;

    private static final int capacity = 10;

    public MyQueue() {
        this.queue = new ArrayList<>();
        this.maxsize = capacity;
    }


    public MyQueue(int maxsize) {
        this.queue = new ArrayList<>();
        this.maxsize = maxsize;
    }

    public void push(T element) {
        if (queue.size() < maxsize) {
            this.queue.add(element);
        } else {
            System.out.println("kolejka jest pelna");
        }
    }

    public void pop() {
        if (queue.size() > 0) {
            this.queue.remove(0);
        } else {
            System.out.println("Not enough elements");
        }
    }

    public void wyswietl() {
        for (T elem : queue) {
            System.out.println(elem);
        }
    }
}


