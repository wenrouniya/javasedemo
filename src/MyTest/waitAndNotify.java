package MyTest;

public class waitAndNotify {
    public static void main(String[] args) throws InterruptedException {
        Object lock=new Object();
        myObject1 t1=new myObject1(lock);
        t1.start();
        Thread.sleep(500);
        myObject2 t2=new myObject2(lock);
        t2.start();
    }
}
