public class Calculator {
    public double add(double x, double y) {
        return x + y;
    }

    public int div(int x, int y) {
        return x / y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public boolean isEven(int x) {
        return  x % 2 == 0;
    }

    public boolean isBlank(String input) {
     return    input==null || input.trim().isEmpty();
    }
}
