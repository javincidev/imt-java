package Class;

class RecTest{
    int[] values;

    RecTest(int i){
        values = new int[i];
    }

    void printArray(int i){
        if(i == 0) return;
        else printArray(i-1);
        System.out.println(" [" + (i - 1) + "] " + values[i - 1]);
    }
}

public class Recursion2 {
    public static void main(String[] args) {
        RecTest t1 = new RecTest(10);
        int i;
        for(i = 0; i < 10; i++) t1.values[i] = i;
        t1.printArray(10);
    }
}
