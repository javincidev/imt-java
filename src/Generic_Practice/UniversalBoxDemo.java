package Generic_Practice;

class Box<T> {
    private T item;

    Box(T t) {
        item = t;
    }
    T getItem() {
        return item;
    }

    void setItem(T t) {
        item = t;
    }
}
class UniversalBoxDemo {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(10);
        System.out.println("В коробке лежит: " + box.getItem());

        Box<String> boxText = new Box<>("Apple");
        System.out.println("В коробке лежит: " + boxText.getItem());
//        box.setItem("fsfsf");
        boxText.setItem("Bannana");
        System.out.println("В коробке лежит: " + boxText.getItem());
    }
}
