public class Nested {
    public static void main(String[] args) {
        int i, j;

        for (i = 10; i > 1; i--){
            for (j = i; j > 1; j--)
                System.out.print(".");
            System.out.println();
        }
    }
}
