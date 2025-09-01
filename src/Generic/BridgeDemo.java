package Generic;

class Gen8<T>{
    T ob;

    Gen8(T o) {
        this.ob = o;
    }

    T getOb() {
        return ob;
    }
}

class Gen9 extends Gen8<String>{
    Gen9(String s) {
        super(s);
    }

    String getOb() {
        System.out.println("Вызван метод Sting getob(): ");
        return ob;
    }
}
class BridgeDemo {
    public static void main(String[] args) {
        Gen9 strOb2 = new Gen9("Тест обобщений");
        System.out.println(strOb2.getOb());
    }
}
