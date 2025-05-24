package Class;

class Test3{
    int a;
    public int b;
    private int c;

    void setc(int i){
        this.c = i;
    }
    int getc(){
        return c;
    }

}

public class AccessTest {
    public static void main(String[] args) {
        Test3 t = new Test3();
        t.a = 10;
        t.b = 10;
//        t.c = 100;
        t.setc(100);

        System.out.println("a, b, c: " + t.a + " " + t.b + " " + t.getc());
    }
}
