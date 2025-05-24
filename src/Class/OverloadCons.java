package Class;


class Box10 {
    double width;
    double height;
    double depth;

    Box10(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box10() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box10(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
public class OverloadCons {
    public static void main(String[] args) {
        Box10 box1 = new Box10(10, 20, 15);
        Box10 box2 = new Box10();
        Box10 mycube = new Box10(7);

        double vol;
        vol = box1.volume();
        System.out.println("Mass box1 equal " + vol);

        vol = box2.volume();
        System.out.println("Mass box2 equal " + vol);

        vol = mycube.volume();
        System.out.println("Mass mycube equal " + vol);
    }
}
