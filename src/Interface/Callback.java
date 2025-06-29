package Interface;

interface Callback {
    void callback(int param);
}


class Client implements Callback {

    @Override
    public void callback(int p) {
        System.out.println(
                "Метод callback(), вызываемый c значением " + p
        );
    }
    void nonifaceMeth () {
        System.out.println(
             "В классах, реализующий интерфейсы, " +
             " могут определятся и другие челены."
        );
    }
}

class TestInterface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
