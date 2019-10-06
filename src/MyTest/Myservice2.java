package MyTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 实现生产者消费者模式：一对一交替打印
 */
public class Myservice2 {
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    private  Boolean flag=false;//控制交替打印的标志
    public void set()  {
            try {
                lock.lock();
                while (flag) {
                    condition.await();
                }
                System.out.println("打印*****");
                flag=!flag;
                condition.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
        public  void get(){
            try {
                lock.lock();
                while (!flag) {
                    condition.await();
                }
                System.out.println("打印 *");
                flag=!flag;
                condition.signal();
            } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                lock.unlock();
            }
            }
        }



