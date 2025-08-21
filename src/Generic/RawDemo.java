package Generic;
class Gen3<T> {
    T ob;

    Gen3(T o) {
        this.ob = o;
    }

    T getOb() {
        return ob;
    }
}
class RawDemo {
    public static void main(String[] args) {
        Gen3<Integer> iOb = new Gen3<Integer>(88);
        Gen3<String> strOb = new Gen3<String>("Тест обобщение");

        Gen3 raw = new Gen3(new Double(98.6));
        double d = (Double) raw.getOb();
        System.out.println("Значение: " + d);

        try {
            int i = (Integer) raw.getOb();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            strOb = raw;
            String str =  strOb.getOb();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            raw = iOb;
            d = (Double) raw.getOb();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
