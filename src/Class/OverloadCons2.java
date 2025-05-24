package Class;

class Box11{
    double width;
    double height;
    double depth;

    Box11 (Box11 obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    Box11 (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box11 () {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box11 (double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
public class OverloadCons2 {
    public static void main(String[] args) {
        Box11 obj1 = new Box11(10, 20, 15);
        Box11 obj2 = new Box11();
        Box11 cube = new Box11(7);

        Box11 clone = new Box11(obj1);
        double vol;

        vol = obj1.volume();
        System.out.println("obj1 = " + vol);

        vol = obj2.volume();
        System.out.println("obj2 = " + vol);

        vol = cube.volume();
        System.out.println("cube = " + vol);

        vol = clone.volume();
        System.out.println("clone = " + vol);
    }
}
