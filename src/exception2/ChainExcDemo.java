package exception2;

class ChainExcDemo {
    static void demoproc(){
        NullPointerException e = new NullPointerException("верхгий уровень");

        e.initCause(new ArithmeticException("причина"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Перехвачено исключение: " + e);

            System.out.println("Первопричина: " + e.getCause());
        }
    }
}
