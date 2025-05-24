public class BoolTest {
    public static void main(String[] args) {
        boolean b1;

        b1 = false;
        System.out.println("b1 равно " + b1);
        b1 = true;
        int dх = 0b1101_0101_0001_1010;
        System.out.println("dх равно " + dх);
        int dх1 = 123_456_789;
        System.out.println("x равно " + dх1);
        System.out.println("b1 равно " + b1);

        if (b1) System.out.println("Это код выполнятеся.");
        b1 = false;
        if (b1) System.out.println("Это код не выполнятеся.");
        System.out.println("10 > 9 равно " + (10 > 9));
    }
}
