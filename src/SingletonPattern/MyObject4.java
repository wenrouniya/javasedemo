package SingletonPattern;

/**
 * 懒汉模式解决线程安全问题
 * DCL 双检查锁机制
 */
public class MyObject4 {
    //volatile  关键字 使变量在线程间可见
    private static volatile MyObject4 myObject4;
    private MyObject4(){}
    public static MyObject4 getInstance(){
        if(myObject4==null)
            synchronized(MyObject4.class){
                myObject4=new MyObject4();
            }
            return myObject4;
    }
}
