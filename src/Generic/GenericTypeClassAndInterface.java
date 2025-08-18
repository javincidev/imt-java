package Generic;


class MyClass {
    public void classMethod() {
        System.out.println("Я метод из MyClass");
    }
}
interface MyInterface {
    void interfaceMethod();
}

class Gen2<T extends MyClass & MyInterface>{
    T obj;

    public Gen2(T o){
        obj = o;
    }

    public void showInfo(){
        obj.classMethod();
        obj.interfaceMethod();
    }
}

class GoodCandidate extends MyClass implements MyInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("GoodCandidate реализует метод интерфейса.");
    }
}

class BadCandidate1 extends MyClass {
    // ...
}

class BadCandidate2 implements MyInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("BadCandidate2 реализует метод.");
    }
}

class AnotherClass {
    // ...
}
class GenericTypeClassAndInterface  {
    public static void main(String[] args) {
        GoodCandidate candidate = new GoodCandidate();
        Gen2<GoodCandidate> gen1 = new Gen2<>(candidate);
        gen1.showInfo();

        System.out.println("--------------------");
    }
}
