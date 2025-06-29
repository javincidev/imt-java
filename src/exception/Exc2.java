package exception;

import java.util.Arrays;

class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try{
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведено");
        }catch (Exception exception){
            System.out.println("Деление на ноль");
        }
        System.out.println("После оператора catch.");
    }
}
