package Thread;

class NewThread2 implements Runnable{
    String name;
    Thread t;
    NewThread2(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start();
    }
    public void run(){
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1500);
            }
        }catch (InterruptedException e){
            System.out.println(name + "прерван");
        }
        System.out.println(name + " завершен.");
    }
}

class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread2("One");
        new NewThread2("Two");
        new NewThread2("Three");

        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }

        System.out.println("Главный поток завершен.");
    }
}
