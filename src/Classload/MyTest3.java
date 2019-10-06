package Classload;

public class MyTest3 {
    public static void main(String[] args) {
         test t=test.getTest();
        System.out.println(test.i);
        System.out.println(test.j);

    }
}
class test{
    public static int i;


    private static test test=new test();
    private test(){
        i++;
        j++;
        System.out.println("==========");
        System.out.println(i);
        System.out.println(j);
        System.out.println("------------");
    }
    public static int j=5;
    public static test getTest(){
        return test;
    }

}

