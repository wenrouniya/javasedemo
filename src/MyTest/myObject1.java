package MyTest;


public class myObject1 extends  Thread{

    public Object object;
    public myObject1(Object object){
        this.object=object;
    }

    @Override
    public void run() {
        synchronized( object){
            System.out.println("开始： wait time");
            try {
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束： wait time");
        }
    }
}
