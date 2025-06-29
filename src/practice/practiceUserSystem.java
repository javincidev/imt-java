package practice;


public class practiceUserSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("avtoCustomer","avtoCustomer@mail.ru");
        Admin admin = new Admin("1sdfsfsaf23","meai@m.ru");
        customer.getEmail();
        admin.banUser(customer);
        customer.placeOrder("Книга по Java");
    }
}
