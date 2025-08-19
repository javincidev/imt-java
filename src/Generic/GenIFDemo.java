package Generic;

interface MinMax<T extends Comparable <T>> {
    T min();
    T max();
}


class My2Class<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    My2Class(T[] o){ vals = o; }

    public T min() {
        T v = vals[0];

        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0 )
                v = vals[i];
        }
        return v;
    }

    public T max() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0 )
                v = vals[i];
        }
        return v;
    }


}
class GenIFDemo {
    public static void main(String[] args) {
        Integer inums[] = { 3, 6, 2, 8, 10, 6 };
        Character chs[] = {'b', 'r', 'p', 'a', 'w'};

        My2Class<Integer> iob = new My2Class<Integer>(inums);
        My2Class<Character> cob = new My2Class<Character>(chs);

        System.out.println("Максимальная значение в массиве inums: " + iob.max());
        System.out.println("Минимальное значение в массиве inums: " + iob.min());

        System.out.println("Максимальная значение в массиве chs: " + cob.max());
        System.out.println("Минимальное значение в массиве chs: " + cob.min());
    }
}
