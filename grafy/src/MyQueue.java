import java.util.ArrayList;

public class MyQueue <T> {
    private ArrayList<T> queue;



    public MyQueue() {
        this.queue = new ArrayList<>();
    }


    public MyQueue(int maxsize) {
        this.queue = new ArrayList<>();
    }

    public void push(T element) {
            this.queue.add(element);
    }

    public T pop() {
        if (queue.size() > 0) {
            return this.queue.remove(0);
        }
        return null;
    }

    public void wyswietl() {
        for (T elem : queue) {
            System.out.println(elem);
        }
    }

    public boolean isEmpty() {
        return queue.size()==0;
    }
}

