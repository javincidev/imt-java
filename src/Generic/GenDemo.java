package Generic;

class Gen<T> {
    T ob;
    Gen(T ob) {
        this.ob = ob;
    }
    T getOb() {
        return ob;
    }
    void showType() {
        System.out.println("Типом T является " + ob.getClass().getName());
    }
}
class GenDemo {
    public static void main(String[] args) {

        Gen<Integer> iob = new Gen<Integer>(88);

        iob.showType();
        int v = iob.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<String>("Тест сообщений");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Значение: " + str);
    }
}
