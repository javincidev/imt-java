package Class;

class Box02 {
    double width;
    double height;
    double depth;

    Box02(Box02 box) {
        width = box.width;
        height = box.height;
        depth = box.depth;
    }

    Box02(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box02() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box02(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box02 {
    double weight;

    BoxWeight(BoxWeight box) {
        super(box);
        weight = box.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
    BoxWeight() {
        super();
        weight = -1;
    }
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight cube = new BoxWeight(3, 3);
        BoxWeight clone = new BoxWeight(mybox1);
        double vol;


        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен: " + vol);
        System.out.println("Весь mybox1 равен  " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен: " + vol);
        System.out.println("Весь mybox2 равен  " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объем mybox3 равен: " + vol);
        System.out.println("Весь mybox3 равен  " + mybox3.weight);
        System.out.println();

        vol = clone.volume();
        System.out.println("Объем clone равен: " + vol);
        System.out.println("Весь clone равен  " + clone.weight);
        System.out.println();

        vol = cube.volume();
        System.out.println("Объем cube равен: " + vol);
        System.out.println("Весь cube равен  " + cube.weight);
        System.out.println();



    }
}
