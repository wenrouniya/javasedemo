package Classload;

public class MyTest1 {
    public static void main(String[] args) {

        System.out.println(child.str1);
    }
}
class parent1{
    public static String str1="this is parent";
    static{
        System.out.println("this is parent static function");
    }
        }
        class child extends  parent1{
    public  static String str2="this is child";
    static{
        System.out.println("this is child static function");
    }

        }
