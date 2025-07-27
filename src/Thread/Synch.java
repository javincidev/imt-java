package Thread;

class Callme {
    void call(String msg) {
        System.out.print(" [ " + msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.println(" ] ");
    }
}


class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run(){
        target.call(msg);
    }
}

/*class Synch {
    public static void main(String[] args) {
        Callme targ = new Callme();
        Caller ob1 = new Caller(targ, "Добро пожаловать");
        Caller ob2 = new Caller(targ, "в синхронизированный");
        Caller ob3 = new Caller(targ, "мир!");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e) {
            System.out.println("Прервано");
        }

    }
}*/
// MyThread.java
// Класс, представляющий наш поток, наследуется от Thread
/*
class MyThread extends Thread {

    public MyThread(String name) {
        super(name); // Вызываем конструктор родительского класса для установки имени потока
    }

    @Override
    public void run() {
        System.out.println("Поток '" + getName() + "' начал выполнение.");
        try {
            for (int i = 1; i <= 8; i++) {
                System.out.println("В потоке '" + getName() + "', счетчик: " + i);
                // Приостанавливаем выполнение потока на 500 миллисекунд
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Поток '" + getName() + "' был прерван.");
        }
        System.out.println("Поток '" + getName() + "' завершил выполнение.");
    }
}

// ThreadCreationDemo1.java
class ThreadCreationDemo1 {
    public static void main(String[] args) {
        System.out.println("Главный поток начал выполнение.");

        // Создаем экземпляр нашего потока
        MyThread t1 = new MyThread("Worker-1");
        MyThread t2 = new MyThread("Worker-2");

        // Запускаем новый поток. JVM вызовет метод run() в новом потоке.
        t1.start();
        t2.start();

        System.out.println("Главный поток продолжает выполнение, не дожидаясь завершения Worker-1.");
        System.out.println("Главный поток продолжает выполнение, не дожидаясь завершения Worker-2.");
    }
}*/
// MyRunnable.java
// Класс, представляющий задачу, реализует интерфейс Runnable
class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Получаем имя текущего потока, в котором выполняется эта задача
        String threadName = Thread.currentThread().getName();
        System.out.println("Задача, выполняемая в потоке '" + threadName + "', началась.");
        try {
            for (int i = 1; i <= 13; i++) {
                System.out.println("В потоке '" + threadName + "', счетчик: " + i);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Поток '" + threadName + "' был прерван.");
        }
        System.out.println("Задача, выполняемая в потоке '" + threadName + "', завершилась.");
    }
}

// ThreadCreationDemo2.java
class ThreadCreationDemo2 {
    public static void main(String[] args) {
        System.out.println("Главный поток начал выполнение.");

        // 1. Создаем экземпляр задачи
        MyRunnable task = new MyRunnable();

        // 2. Создаем поток, передавая ему задачу и имя
        Thread t1 = new Thread(task, "Worker-1");
        Thread t2 = new Thread(task, "Worker-2");
        Thread t3 = new Thread(task, "Worker-3");

        // 3. Запускаем поток
        t1.start();
        t2.start();
        t3.start();

        System.out.println("Главный поток продолжает выполнение.");
    }
}