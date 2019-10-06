package SingletonPattern;

/**
 * 延迟加载/“懒汉模式”
 * 调用get方法时 实例才被创建
 * 非线程安全
 */
public class MyObject2 {
    private static MyObject2 myObject2;
    private  MyObject2(){}
    public static MyObject2 getInstance(){
        //在此处可能有CPU的切换 导致最终创建的结果不是一个实例 与单例模式的初衷相违背  存在线程安全问题
        if (myObject2==null){
            myObject2=new MyObject2();
        }
        return myObject2;
    }

}
