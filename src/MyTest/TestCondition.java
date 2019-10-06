package MyTest;

public class TestCondition {

    public static void main(String[] args) throws InterruptedException {
        Myservice1 myservice1=new Myservice1();
        Thread1 thread1=new Thread1(myservice1);
        thread1.start();
        Thread.sleep(5000);
        myservice1.singal();
    }
}
