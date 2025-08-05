package Enum;

enum Apple4 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
class EnumDemo4 {
    public static void main(String[] args) {
        Apple4 ap, ap2, ap3;

        System.out.println("Все константы сортов яблок " + " и их порядковое значения: ");

        for (Apple apple : Apple.values()) {
            System.out.println(apple + " " + apple.ordinal());
        }

        ap = Apple4.RedDel;
        ap2 = Apple4.GoldenDel;
        ap3 = Apple4.RedDel;

        System.out.println();

        if (ap.compareTo(ap2) < 0)
            System.out.println(ap + " предшествует " + ap2);

        if (ap.compareTo(ap2) > 0)
            System.out.println(ap2 + " предшествует " + ap);

        if (ap.compareTo(ap3) > 0)
            System.out.println(ap + " предшествует " + ap3);

        System.out.println();

        if (ap.equals(ap2))
            System.out.println("Ошибка!");

        if (ap.equals(ap3))
            System.out.println(ap + " равно " + ap3);

        if (ap == ap3)
            System.out.println(ap + " == " + ap3);
    }
}
