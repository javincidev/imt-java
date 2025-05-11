import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
            throws java.io.IOException {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в Калкюлятор");
        System.out.print("Введите первое значение: ");
        int fInput = scanner.nextInt();

        do {
            System.out.println("Справка по меню:");
            System.out.println("1. + (прибавить)");
            System.out.println("2. - (отнять)");
            System.out.println("3. / (деление)");
            System.out.println("4. * (умножение)");
            System.out.println("5. % (деление на остаток)");
            System.out.print("Выберите нужное действие (1-5): ");
            choice = scanner.nextInt();
        }while (choice < 1 || choice > 5);

        System.out.print("Введите второе значение: ");
        int sInput = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println(fInput + " + " + sInput + " = " + (fInput + sInput));
                break;
            case 2:
                System.out.println(fInput + " - " + sInput + " = " + (fInput - sInput));
                break;
            case 3:
                if (sInput != 0)
                    System.out.println(fInput + " / " + sInput + " = " + (fInput / sInput));
                else
                    System.out.println("Ошибка: деление на ноль.");
                break;
            case 4:
                System.out.println(fInput + " * " + sInput + " = " + (fInput * sInput));
                break;
            case 5:
                if (sInput != 0)
                    System.out.println(fInput + " % " + sInput + " = " + (fInput % sInput));
                else
                    System.out.println("Ошибка: деление на ноль.");
                break;
            default:
                System.out.println("Неверный выбор операции.");
        }
    }
}
