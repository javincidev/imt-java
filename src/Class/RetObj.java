package Class;

class Test2 {
    int a;

    Test2(int i) {
        a = i;
    }

    Test2 incrByTen() {
        Test2 t2 = new Test2(a + 10);
        return t2;
    }
}

public class RetObj {
    public static void main(String[] args) {
        Test2 t1 = new Test2(2);
        Test2 t2;

        t2 = t1.incrByTen();
        System.out.println("t1.a " + t1.a);
        System.out.println("t2.a " + t2.a);

        t2 = t2.incrByTen();
        System.out.println("t2.a " + t2.a);

    }
}
