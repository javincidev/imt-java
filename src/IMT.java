import java.util.Scanner;

public class IMT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String category;
        char exit;

        try {
            do{
                System.out.println("Ведите ваш рост: ");
                int height = scanner.nextInt();
                double heightM =  (height / 100.0);
                System.out.println("Ведите ваш вес: ");
                int weight = scanner.nextInt();
                double result = (double) weight / (heightM * heightM);
                String formattedResult = String.format("%.2f", result);
                if (result < 18.5) {
                    category = "Дефицит массы";
                } else if (result < 25) {
                    category = "Нормальный вес";
                } else if (result < 30) {
                    category = "Избыточный вес";
                } else if (result < 35) {
                    category = "Ожирение I степени";
                } else if (result < 40) {
                    category = "Ожирение II степени";
                } else {
                    category = "Ожирение III степени";
                }
                System.out.println("Ваш ИМТ: " + formattedResult + ". Категория: " + category);
                System.out.println("Хотите выйте? (y/n) ");
                exit = scanner.next().charAt(0);
                System.out.println(exit);
            }

            while ((exit != 'n'));

        }catch (Exception e){
            System.out.println("Ошибка: введено некоректное значение.");
        }

    }
}
