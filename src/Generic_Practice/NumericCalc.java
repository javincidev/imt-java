package Generic_Practice;

class Calculator {
    public static <N extends Number> double sum(N a, N b) {
        return a.doubleValue() + b.doubleValue();
    }
}

class NumericCalc {
    public static void main(String[] args) {
        double result1 = Calculator.sum(10, 12.5);
        System.out.println("Integer + Double результат: " + result1);

        double result2 = Calculator.sum(5.4, 12.5f);
        System.out.println("Double результат: " + result2);

        double result3 = Calculator.sum(7, 11);
        System.out.println("Iteger результат: " + result3);

    }
}
