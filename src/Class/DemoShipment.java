package Class;

class Box01 {
    double width;
    double height;
    double depth;

    Box01(Box01 box) {
        width = box.width;
        height = box.height;
        depth = box.depth;
    }

    Box01(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box01() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box01(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight1 extends Box01 {
    double weight;

    BoxWeight1(BoxWeight1 box) {
        super(box);
        weight = box.weight;
    }

    BoxWeight1(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
    BoxWeight1() {
        super();
        weight = -1;
    }
    BoxWeight1(double len, double m) {
        super(len);
        weight = m;
    }
}
class Shipment extends BoxWeight1 {
    double cost;

    Shipment(Shipment ship) {
        super(ship);
        cost = ship.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20,15,10,3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.076, 1.28);
        double vol;


        vol = shipment1.volume();
        System.out.println("Объем shipment1 равен: " + vol);
        System.out.println("Весь shipment1 равен  " + shipment1.weight);
        System.out.println("Стоимость доставки: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Объем shipment2 равен: " + vol);
        System.out.println("Весь shipment2 равен  " + shipment2.weight);
        System.out.println("Стоимость доставки: $" + shipment2.cost);
        System.out.println();
    }
}
