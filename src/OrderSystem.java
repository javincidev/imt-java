import java.util.Scanner;

public class OrderSystem {
    public static void main(String[] args)
            throws java.io.IOException {

        char choice;
        Scanner scanner = new Scanner(System.in);
        String[] orders = new String[5];


        int index = 0;
        do {
            System.out.println("Справка по действиям:");
            System.out.println("1. Добавить заказ");
            System.out.println("2. Показать все заказы");
            System.out.println("3. Посчитать общую сумму");
            System.out.println("4. Выйти");
            System.out.println("Выберите нужный пункт:");
            String input = scanner.nextLine();
            choice = input.isEmpty() ? '0' : input.charAt(0);
            switch (choice) {
                case '1':

                    System.out.println("Добавить заказ:");
                    System.out.println("Введите имя клиента: ");
                    String client_name = scanner.nextLine();
                    System.out.println("Введите товар: ");
                    String product = scanner.nextLine();
                    System.out.println("Введите количество: ");
                    String quantity = scanner.nextLine();
                    System.out.println("Введите цену: ");
                    String price = scanner.nextLine();

                    orders[index++] = client_name + ", " + product + ", " + quantity + ", " + price;
                    break;
                case '2':
                    System.out.println("Показать все заказы:");
                    for (int i = 0; i < index; i++) {
                        System.out.println(orders[i]);
                    }
                    break;
                case '3':
                    System.out.println("Посчитать общую сумму:");
                    double total = 0;
                    for (int i = 0; i < index; i++) {
                        String order = orders[i];
                        String[] parts = order.split(", ");
                        int quantityInt = Integer.parseInt(parts[2]);
                        double priceInt = Double.parseDouble(parts[3]);

                        total = total + quantityInt * priceInt;
                    }
                    System.out.println("Общая сумма: " + total);
                    break;
                case '4':
                    System.out.println("Вы вышли из программы! \n");
                    choice = 4;
                    break;
            }

        } while (choice < 1 || choice > 4);
    }


}
