package Class;
class Box1 {
    double width;
    double height;
    double depth;
}

class BoxDemo {
    public static void main(String[] args) {
        Box1 box = new Box1();
        double vol;

        box.width = 1.0;
        box.height = 2.0;
        box.depth = 1.5;

        vol = box.width * box.height * box.depth;
        System.out.println("Oбъeм равен " + vol);
    }
}