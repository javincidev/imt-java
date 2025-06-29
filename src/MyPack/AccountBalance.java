package MyPack;

class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal < 0)
            System.out.println("--> ");
        System.out.println(name + " : $" + bal);
    }
}

class AccountBalance {
    public static void main(String[] args) {
        Balance[] balance = new Balance[3];
        balance[0] = new Balance("Bob", 123.23);
        balance[1] = new Balance("Will", 157.02);
        balance[2] = new Balance("Tom", -12.33);

        for (int i=0; i<3; i++) balance[i].show();

    }
}
