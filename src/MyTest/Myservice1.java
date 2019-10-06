package MyTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Condition 的使用
 */
public class Myservice1 {
    /**
     * Lock 是一个接口
     * ReentrantLock implements Lock
     */
    private static Lock lock=new ReentrantLock();
    private static Condition condition=lock.newCondition();
    public void await(){
        lock.lock();
        System.out.println("await 时间为"+System.currentTimeMillis());
        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public  void  singal(){
        lock.lock();
        System.out.println("singal的时间为:"+System.currentTimeMillis());
        try{
            condition.signal();
        }finally {
            lock.unlock();
        }
    }
}
