package ClassUnloading;

public class MySample {
    public MySample(){
        System.out.println("MySample is load by "+this.getClass().getClassLoader());

        new Mycat();

    }
}
