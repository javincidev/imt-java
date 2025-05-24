package Class;


class Box7 {
    double width;
    double height;
    double depth;

    Box7 (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class Stack {
    int[] stck = new int [10];
    int tos;

    Stack () {
        tos = -1;
    }
    void push (int item) {
        if (tos == 9)
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }

    int pop () {
        if (tos < 0){
            System.out.println("Stack is empty");
            return 0;
        }
        else
            return stck[tos--];
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3, 6, 9);

        double vol;

        vol = mybox1.volume();
        System.out.println(vol);

        vol = mybox2.volume();
        System.out.println(vol);
    }
}
