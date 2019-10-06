package MyTest;

public class myObject2 extends  Thread{

    public Object object;
    public myObject2(Object object){
        this.object=object;
    }

    @Override
    public void run() {
        synchronized( object){
            System.out.println("开始： notify time");
            object.notify();
            System.out.println("结束： notify time");
        }
    }
}
