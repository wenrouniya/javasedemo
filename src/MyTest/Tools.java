package MyTest;

import javax.tools.Tool;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tools {
    private Lock lock=new ReentrantLock();

    public  void service(){
        lock.lock();
        for(int i=0;i<5;i++) {
            System.out.println("当前线程的名称" + Thread.currentThread().getName());
        }
        lock.unlock();
    }
}
