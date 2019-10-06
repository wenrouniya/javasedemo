package ClassUnloading;

public class Mycat {
    public Mycat(){
        System.out.println("Mycat id load by"+this.getClass().getClassLoader());
    }
}
