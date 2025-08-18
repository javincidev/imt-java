package Generic;

class Stats<T extends Number>{
    T[] nums;

    Stats(T[] o){
        nums = o;
    }

    double average(){
        double sum = 0.0;

        for(int i=0; i < nums.length; i++)
            sum += nums[i].doubleValue();

        return sum / nums.length;
    }

    boolean sameAverage(Stats<?> ob){
        return average() == ob.average();
    }

}
class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[] = { 1, 2, 3, 4, 5};
        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5  };
        Float fnums[] = { 1.0F, 2.0F,  3.0F,  4.0F,  5.0F, };

        Stats<Integer> iob = new Stats<Integer>(inums);
        Stats<Double> dob = new Stats<Double>(dnums);
        Stats<Float> fob = new Stats<Float>(fnums);

        double v = iob.average();
        System.out.println("Среднее значение iob равно " + v);

        double w = dob.average();
        System.out.println("Среднее значение dob равно " + w);

        double x = fob.average();
        System.out.println("Среднее значение fob равно " + x);
        System.out.println();

        System.out.println("Среднее значение iob и dob");
        if (iob.sameAverage(dob))
            System.out.println("равный");
        else
            System.out.println("отличаются");

        System.out.println("Средние iob и fob ");
        if (iob.sameAverage(fob))
            System.out.println("одинаковое");
        else
            System.out.println("отличаются");

    }
}
