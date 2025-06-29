package exception2;
import java.lang.RuntimeException;

class ThrowsDemo {
    static void throwOne() throws IllegalArgumentException {
        System.out.println("В теле метода throwOne().");
        throw new IllegalArgumentException("демонстрация");
    }
    public static void main(String[] args) {
        try{
            throwOne();
        }catch (IllegalArgumentException e){
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
