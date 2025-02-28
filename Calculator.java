class Calculator {
    public int add(int a, int b) {
        return a + b;
      }
    public int add(int a, int b, int c) {
        return a + b + c;
  }
    public double add(double a, double b) {
        return a + b;
    }
    public double add(int a, double b) {
        return a + b;
    }
    public double add(double a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: " + calc.add(10, 20));
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));
        System.out.println("Sum of two doubles: " + calc.add(10.2,15.1));
        System.out.println("Sum of an integer and a double: " + calc.add(10, 15.1));
        System.out.println("Sum of a double and an integer: " + calc.add(10.2, 20));
    }
}