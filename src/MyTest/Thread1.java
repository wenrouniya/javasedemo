package MyTest;

import javax.tools.Tool;

public class Thread1 extends  Thread {
    private Myservice1 myservice1;
    Thread1(Myservice1 myservice1){
        this.myservice1=myservice1;
    }
    @Override
    public void run() {
        super.run();
        myservice1.await();
    }
}
