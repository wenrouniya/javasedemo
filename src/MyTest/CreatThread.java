package MyTest;

/**
 * 生产者
 */
public class CreatThread  extends  Thread{
    private Myservice2 myservice2;
    CreatThread(Myservice2 myservice2){
        this.myservice2=myservice2;//将这个类实例化的变量的condition赋值
    }

    @Override
    public void run() {
        super.run();
        for (int i=0;i<10;i++) {
            myservice2.set();
        }
    }
}
