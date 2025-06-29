package practiceInterface;

public class CardPayment implements Payment {
    public void pay(double price) {
        System.out.println("Оплата картой на сумму $" + price);
    }
}
