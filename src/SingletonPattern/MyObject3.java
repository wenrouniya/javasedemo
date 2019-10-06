package SingletonPattern;

/**
 * 方法加入同步synchronized关键字得到相同的实例对象 但效率低下 是同步运行的
 * 下一个线程想要取得对象，必须等上一个线程释放锁之后才可以继续运行
 */
public class MyObject3 {
    private  static MyObject3 myObject3;
    private MyObject3(){}
    //static修饰方法后，最大的作用就是可以"类名.方法名"调用该方法
  static synchronized  public MyObject3 getInstance(){
        if(myObject3==null){
            myObject3=new MyObject3();
        }
        return myObject3;
    }

}
