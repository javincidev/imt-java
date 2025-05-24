package Class;

class Test1 {
    int a, b;
    Test1(int i, int j) {
        a = i;
        b = j;
    }

    void meth (Test1 t) {
        t.a *= 2;
        t.b /= 2;
    }

}

public class PassObjRe {
    public static void main(String[] args) {
        Test1 t1 = new Test1(15, 20);
        System.out.println("t1.a and t1.b before changing " + t1.a + " and " + t1.b);

        t1.meth(t1);

        System.out.println("t1.a and t1.b after changing " + t1.a + " and " + t1.b);

    }
}
