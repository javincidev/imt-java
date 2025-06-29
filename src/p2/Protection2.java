package p2;

import p1.Protection;

public class Protection2 extends Protection {
    public Protection2() {
        System.out.println("конструктор унаследованный из другого пакета");
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
