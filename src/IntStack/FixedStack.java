package IntStack;

class FixedStack implements IntStack {
    private int[] stck;
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1)
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }

    public int pop() {
    if (tos < 0){
        System.out.println("Stack is empty");
        return 0;
    }
    else
        return stck[tos--];
    }
}

class IFTest {
    public static void main(String[] args) {
        FixedStack fs1 = new FixedStack(5);
        FixedStack fs2 = new FixedStack(8);

        for(int i=0; i<5; i++)fs1.push(i);
        for(int i=0; i<8; i++)fs2.push(i);

        System.out.println("Stack in fs1:");
        for (int i=0; i<5; i++)
            System.out.println(fs1.pop());

        System.out.println("Stack in fs2:");
        for (int i=0; i<8; i++)
            System.out.println(fs2.pop());
    }
}
