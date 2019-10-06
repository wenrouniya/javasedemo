package Classload;
//常量在编译阶段会被存入到调用这个常量的方法所在的类的常量池中
//本质上 并没有直接引用到定义常量的类 因此并不会触发定义常量的类的初始化
//注意：这里指的是将常量存放到了mutest2的常量池中 之后mytest2与parent没有任何关系
//甚至可以将parent的class文件删除

/**
 * java助记符
 * ldc：表示将int,float或者是String类型的常量值从常量池推送到栈顶
 * bipush:表示将单字节（-128到127）的常量值推送至栈顶
 *sipush:表示将一个段整形（-32768 到32767）推送至栈顶
 * iconnst_m1:表示-1
 * iconnst_1:表示将int类型的1推送至栈顶（主要是iconst_-1 到icons_5)
 */


public class MyTest2 {
    public static void main(String[] args) {
        parent2 [] p=new parent2[1];
        System.out.println(p);
        System.out.println(p.getClass());
        System.out.println("==========");

        int [] i=new int[10];
        System.out.println(i.getClass());
    }
}

class parent{
    //final 代表该值被赋予常量 不可以在更改
    public static  final String str="hello word";


    static{
        System.out.println("parent function");
    }
}
class parent2{
    static{
        System.out.println("parent2");
    }
}

