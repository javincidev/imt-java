package practice;

public class Customer extends User {

    protected Customer(String password, String email) {
        super(password, email);
    }

    public void placeOrder(String item) {
        System.out.println("Клиент " + this.getEmail() + " оформил заказ: " + item);
    }


}
