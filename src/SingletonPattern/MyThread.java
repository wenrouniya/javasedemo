package SingletonPattern;

public class MyThread extends  Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-----"+
                MyObject5.getInstance().hashCode());
    }
}
