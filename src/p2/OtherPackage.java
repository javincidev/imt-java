package p2;


class OtherPackage {
    OtherPackage(){
        p1.Protection p = new p1.Protection();
        System.out.println("конструктор из другого пакета");
        // доступно только для данного класса или пакета
        // System.out.println("n = " + p.n) ;

        // доступно только для данного класса
//        System.out.println("n_pri = " + n_pri);

        //доступен только для данного класса, подкласса или пакета
//        System.out.println("n_pro = " + n_pro);
    }
}
