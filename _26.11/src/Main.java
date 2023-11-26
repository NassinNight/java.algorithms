public class Main {
    public static void main(String[] args) {
        Order o1 = new Order(100, "Klawiatura", 50100);
        Order o2 = new Order(200, "Mysz", 100100);
        MyQueue<Order> queue = new MyQueue<>();
        queue.push(o1);
        queue.push(o2);
        queue.wyswietl();
        System.out.println("--------------");
        queue.pop();
        queue.wyswietl();

    }
}