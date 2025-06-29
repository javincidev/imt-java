package exception2;

class ThrowDemo {
    static void demoproc (){
        try{
            throw new NullPointerException("Демонстрация");
        }catch (NullPointerException e){
            System.out.println(
                    "Исключение перевачено в теле метода demoproc()."
            );
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Повторный перехват: " + e.getMessage());
        }
    }
}
