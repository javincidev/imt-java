package Generic;

class Gen6<T> {
    T ob;

    Gen6(T o) {
        this.ob = o;
    }

    T getOb() {
        return ob;
    }
}

class Gen7<T> extends Gen6<T> {
    Gen7(T o) {
        super(o);
    }
}

public class HierDemo3 {
    public static void main(String[] args) {
        Gen6<Integer> iOb = new Gen6<Integer>(88);

        Gen7<Integer> iOb2 = new Gen7<Integer>(99);
        Gen7<String> strOb2 = new Gen7<String>("Тест обобщений");

        if (iOb2 instanceof Gen7<?>) {
            System.out.println(
                    "Объект iOb2 является экземпляром класса Gen7"
            );
        }
        if (iOb2 instanceof Gen6<?>) {
            System.out.println(
                    "Объект iOb2 является экземпляром класса Gen6"
            );
        }
        System.out.println();
        if (strOb2 instanceof Gen6<?>) {
            System.out.println(
                    "Объект strOb2 является экземпляром класса Gen6"
            );
        }

        if (strOb2 instanceof Gen7<?>) {
            System.out.println(
                    "Объект strOb2 является экземпляром класса Gen7"
            );
        }
        System.out.println();

        if (iOb instanceof Gen7<?>) {
            System.out.println(
                    "Объект iOb является экземпляром класса Gen7"
            );
        }

        if (iOb instanceof Gen6<?>) {
            System.out.println(
                    "Объект iOb является экземпляром класса Gen6"
            );
        }
        System.out.println();
    }
}
