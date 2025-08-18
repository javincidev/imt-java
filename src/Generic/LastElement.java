package Generic;

class LastElement {
    public static <T> T getLastElement(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return array[array.length - 1];
    }

    public static void main(String[] args) {
        String[] languages = {"Java", "C#", "Python", "PHP"};
        String language = getLastElement(languages);
        System.out.println("Последний язык: " + language);

        Integer[] ids = { 101, 202, 303 };
        Integer lastId = getLastElement(ids);
        System.out.println("Последний Id: " + lastId);

        Object[] emptyArray = {};
        Object lastElement = getLastElement(emptyArray);
        System.out.println("Последний элемент пустого массива: " + lastElement);

    }
}
