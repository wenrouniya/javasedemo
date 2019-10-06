/**
 * 线程安全问题 银行转账
 * 模拟线程安全问题
 * 线程互斥   synchronized 同一把锁挡住互斥的线程 synchronized {内部为要挡住的方法} 或直接将synchronized写在方法上
 *
 * synchronized的三种用法
 * 修饰实例方法，作用于当前实例加锁，进入同步代码前要获得当前实例的锁
 * 修饰静态方法，作用于当前类对象加锁，进入同步代码前要获得当前类对象的锁
 * 修饰代码块，指定加锁对象，对给定对象加锁，进入同步代码库前要获得给定对象的锁
 *
 * 注意：
 * 多个线程作用于不同的对象 获得的是不同的锁 互相之间并不相互影响 就像两条线路一样
 * 两个线程实例化两个不同的对象，但是访问的方法是静态的，两个线程发生了互斥（即一个线程访问，另一个线程只能等着）
 * 因为静态方法是依附于类而不是对象的，当synchronized修饰静态方法时，锁是class对象。
 * */
public class TraditionalThreadSynchronized {


    public static void main(String[] args) {
        new TraditionalThreadSynchronized().init();

    }

    public void init() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                soutName.soutName("heli");
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    soutName.soutName("liruixuan");
                }
            }
        }).start();
    }

    /**
     * 静态方法职能生声明在外部类中
     *加static可以让系统默认为外部类
     * static方法调用的对象为Java字节码对象
     */
    static class soutName {
        public static synchronized void soutName(String name) {
            int len = name.length();
            for (int i = 0; i < len; i++) {
                System.out.print(name.charAt(i));
            }
            System.out.println();
        }
    }
}
