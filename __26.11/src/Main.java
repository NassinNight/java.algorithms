public class Main {
    public static void main(String[] args) {
        ReversePolishNotationCalculator p1 = new ReversePolishNotationCalculator();
        try {
            p1.dodawanie();
        } catch (FullStackException | EmptyStackException e) {
            throw new RuntimeException(e);
        }
    }
}