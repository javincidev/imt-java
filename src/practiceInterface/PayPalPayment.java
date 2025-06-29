package practiceInterface;

public class PayPalPayment implements Payment {

    public void pay(double price) {
        System.out.println("Оплата через PayPal на сумму $" + price);
    }
}
