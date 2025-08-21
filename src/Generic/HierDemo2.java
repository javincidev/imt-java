package Generic;

class NonGen {
     int num;

     NonGen(int i) {
         this.num = i;
     }
     int getNum() {
         return num;
     }
}
class Gen4<T> extends NonGen {
    T ob;
    Gen4(T o, int i) {
        super(i);
        this.ob = o;
    }
    T getOb() {
        return ob;
    }

}
class HierDemo2 {
    public static void main(String[] args) {
        Gen4<String> w = new Gen4<String>("Добро пожаловать", 47);
        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }

}
