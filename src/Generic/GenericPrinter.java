package Generic;

class GenericPrinter {
    static <E> void printArray(E[] inputArray){
        for(E element : inputArray){
            System.out.printf("%s, ", element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};
        Double[] doubleArray = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
        String[] stringArray = { "Привет", "Мир", "Java" };

        System.out.println("Массив integerArray содержит:");
        printArray(intArray);

        System.out.println("\nМассив doubleArray содержит:");
        printArray(doubleArray);

        System.out.println("\nМассив stringArray содержит:");
        printArray(stringArray);
    }
}
