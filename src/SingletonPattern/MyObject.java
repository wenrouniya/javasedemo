package SingletonPattern;

/**
 *立即加载/“饿汉模式”
 * 就是使用类的时候就已经将对象创建完毕 常见的办法就是直接new实例化
 * 优点：类加载时完成初始化 获取对象速度快  不存在线程安全问题
 * 缺点：类加载速度慢
 */
public class MyObject {
    //立即加载方式==饿汉模式
    //将对象实例化
    private static MyObject myObject=new MyObject();
    //构造函数私有化
    private MyObject(){}
    //得到实例的方法
    public static MyObject getInstance(){
        return myObject;
    }
}
