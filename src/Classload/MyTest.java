package Classload;

public class MyTest {

    public static void main(String[] args) {
        ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);

        Class <?> clazz=MyTest.class;
        System.out.println(clazz.getClassLoader());
        System.out.println("==============");

        Class <?> clazz1=String.class;
        System.out.println(clazz1.getClassLoader());
        System.out.println("==============");



        //如果元素为原生类型 数组类没有类加载器
        int[] array=new int[10];
        System.out.println(array.getClass());
        System.out.println(array.getClass().getClassLoader());

        type[] arr=new type[2];
        System.out.println(arr.getClass());
        System.out.println(arr.getClass().getClassLoader());
    }

}
class type{
    int a;
    int b;
}
