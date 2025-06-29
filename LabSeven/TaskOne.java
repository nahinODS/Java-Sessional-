public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 30 and 40 (int): " + calc.add(30, 40));
        System.out.println("Sum of 4.5 and 3.2 (double): " + calc.add(4.5, 3.2));
        System.out.println("Sum of 1, 2, and 3 (int): " + calc.add(1, 2, 3));
    }
}
