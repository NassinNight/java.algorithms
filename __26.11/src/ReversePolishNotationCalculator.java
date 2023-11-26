import java.util.Arrays;

public class ReversePolishNotationCalculator {
    String[] tab;
    Stack<Double> stack;

    public ReversePolishNotationCalculator(String a) {
        this.tab = a.split(" ");
        this.stack = new Stack<Double>(50);
    }

    public ReversePolishNotationCalculator() {
        this.stack = new Stack<Double>(50);
        this.tab = new String[]{"2", "45","tan", "*"};
    }

    public void check() {
        try {
            Integer.parseInt(tab[0]);
            Integer.parseInt(tab[1]);
        } catch (NumberFormatException e) {
            System.out.println("x");
        }
    }

    public void dodawanie() throws FullStackException, EmptyStackException {
        System.out.println(Arrays.toString(tab));

        for (int i = 0; i < tab.length; i++) {
            try {
                stack.push(Double.parseDouble(tab[i]));
                System.out.println(stack);
            } catch (NumberFormatException e) {
                if (tab[i] == "+") {
                    stack.push(stack.pop()+stack.pop());
                }
                if (tab[i] == "-") {
                    stack.push((stack.pop()-stack.pop())*-1);
                }
                if (tab[i] == "*") {
                    stack.push(stack.pop()*stack.pop());
                }
                if (tab[i] == "/") {
                    stack.push(1/(stack.pop()/stack.pop()));
                }
                if (tab[i] == "^") {
                    Double c = stack.pop();
                    Double j = stack.pop();
                    stack.push(Math.pow(j,c));
                }
                if (tab[i] == "sin") {
                    double degrees = stack.pop();
                    double radians = Math.toRadians(degrees);
                    double sinValue = Math.sin(radians);
                    stack.push(sinValue);
                }
                if (tab[i] == "cos") {
                    double degrees = stack.pop();
                    double radians = Math.toRadians(degrees);
                    double cosValue = Math.cos(radians);
                    stack.push(cosValue);
                }
                if (tab[i] == "tan") {
                    double degrees = stack.pop();
                    double radians = Math.toRadians(degrees);
                    double tanValue = Math.tan(radians);
                    stack.push(tanValue);
                }
            }

        }
        System.out.println(stack.pop());
    }

    @Override
    public String toString() {
        return "ReversePolishNotationCalculator{" +
                "tab=" + Arrays.toString(tab) +
                ", stack=" + stack +
                '}';
    }
}
