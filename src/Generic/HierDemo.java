package Generic;

class Gen1<T>{
    T ob;

    Gen1(T ob){
        this.ob = ob;
    }
    T getOb(){
        return ob;
    }
}

class Gen5<T, V> extends Gen1<T>{
    V ob2;
    Gen5(T o, V o2){
        super(o);
        this.ob2 = o2;
    }
    V getOb2(){
        return ob2;
    }
}

class HierDemo  {
    public static void main(String[] args) {
        Gen5<String, Integer> x = new Gen5<String, Integer>("Значение равно: ", 99);
        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}
