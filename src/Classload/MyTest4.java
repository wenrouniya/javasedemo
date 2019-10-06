package Classload;

public class MyTest4 extends ClassLoader {
    private String ClassLoaderName;
    private final String FileExtension=".class";

    public MyTest4(String ClassLoaderName){
        super();//调用父类无参构造 构造方法默认传的参数将系统的类加载器当做该类加载器的父加载器
        this.ClassLoaderName=ClassLoaderName;
    }
    public MyTest4(ClassLoader parent,String classLoaderName){
        super(parent);//显示指定该类的父类加载器
        this.ClassLoaderName=classLoaderName;
    }

}
