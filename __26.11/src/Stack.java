import java.util.ArrayList;

public class Stack<T> {

    private static final int DEFAULT_CAPACITY = 5;

    private ArrayList<T> stack;

    private int maxCapacity;

    public Stack(int size) {
        this.maxCapacity = size;
        this.stack = new ArrayList<>();
    }

    public Stack() {
        this.stack = new ArrayList<>();
        this.maxCapacity = DEFAULT_CAPACITY;
    }

    public void push(T obj) throws FullStackException {
        if (size()<maxCapacity) {
            stack.add(obj);
        } else {
            throw new FullStackException("pelen stos");
        }
    }

    public T pop() throws EmptyStackException {
        if (!isEmpty()) {
            return stack.remove(lastIndex());
        } else {
            throw new EmptyStackException("pusty");
        }
    }

    public T peek() throws EmptyStackException {
        if (!isEmpty()) {
            return stack.get(lastIndex());
        } else {
            throw new EmptyStackException("pusty");
        }
    }
    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return size()==0;
    }

    private int lastIndex(){
        return size()-1;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + stack +
                '}';
    }
}
