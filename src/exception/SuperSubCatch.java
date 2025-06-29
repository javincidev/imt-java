package exception;

class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 42 / a;
        }catch (ArithmeticException e){
            System.out.println(
                    "Этот код вообще не достижим."
            );
        }catch (Exception exception){
            System.out.println(
                    "Перехват исключение общего класса Exception"
            );
        }
    }
}
