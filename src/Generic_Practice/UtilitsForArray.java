package Generic_Practice;


class Utils {
    public static <E> void printArray(E[] inputArray) {
        for (E e : inputArray) {
            System.out.println("Элемент в массиве: " + e);
        }

    }
}

class UtilitsForArray {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Яблоко", "Банан", "Апельсин"};

        System.out.println("Печатаем массив чисел:");
        Utils.printArray(intArray);

        System.out.println();

        System.out.println("Печатаем массив строк:");
        Utils.printArray(stringArray);
    }
}
