package SingletonPattern;

/**
 *静态内部类实现单例模式  线程安全
 */
public class MyObject5 {
    //内部类方式
    private static class MyObjectHandler{
        private static MyObject5 myObject5=new MyObject5();
    }
    private MyObject5(){}
    //getInstance()方法并没有多次去new对象，
    // 故不管多少个线程去调用getInstance()方法，
    // 取的都是同一个INSTANCE对象，而不用去重新创建。
    // 当getInstance()方法被调用时，SingleTonHoler才在SingleTon的运行时常量池里，
    // 把符号引用替换为直接引用，这时静态对象INSTANCE也真正被创建，
    // 然后再被getInstance()方法返回出去，这点同饿汉模式

    public static MyObject5 getInstance(){
        return MyObjectHandler.myObject5;
    }


}
