package Enum;

enum Apple2 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo2 {
    public static void main(String[] args) {
        Apple2 ap;
        System.out.println("Константы перечислимого типа Apple:");

        Apple2[] allapples = Apple2.values();
        for (Apple2 apple : allapples) {
            System.out.println(apple);
        }
        System.out.println();

        ap = Apple2.valueOf("Winesap");
        System.out.println("Переменная ap содержит " + ap);
    }
}
