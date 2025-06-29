package IntStack;

interface IntStack {
    void push(int item);
    int pop();
    default void clear() {
        System.out.println("Метод clear()  не реализован");
    }
}
