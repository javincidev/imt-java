package Class;

class OverloadDemo {
    void test(){
        System.out.println("Параметер отсуствует");
    }

    void test(int a){
        System.out.println("a: " + a);
    }

    void test(int a, int b){
        System.out.println("a and b: " + a + ' ' + b);
    }

    double test(double a){
        return a * a;
    }
}
public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Result calling ob.test(123.25): " + result);
    }
}
