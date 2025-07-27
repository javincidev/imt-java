package Enum;

enum Apple3 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private int price;
    Apple3(int p) {price = p;}

    public int getPrice() {
        return price;
    }
}

class EnumDemo3 {
    public static void main(String[] args) {
        Apple3 ap;
        System.out.println("Яблоко сорта Winesap стоит " +  Apple3.Winesap.getPrice() + " центов.\n");

        System.out.println("Цены на все сорта яблок:");

        for (Apple3 apple : Apple3.values()) {
            System.out.println(apple + "стоит " + apple.getPrice() + " центов.");
        }
    }
}
