package Generic;

class MaxElementFinder {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0)
            return null;

        T max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5 };
        System.out.println("Максимальное число: " + findMax(numbers));

        String[] words = {"Яблоко", "Апельсин", "Банан"};
        System.out.println("Максимальная строка (по алфавиту): " + findMax(words));
    }
}
