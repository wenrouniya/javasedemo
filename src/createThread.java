import java.security.spec.ECField;

/**
 *
 * 创建线程的两种方式  创建Thread的子类 实现runable接口
 * 采用实现Runnable、Callable接口的方式创见多线程时，优势是：
 *
 * 线程类只是实现了Runnable接口或Callable接口，还可以继承其他类。
 *
 * 在这种方式下，多个线程可以共享同一个target对象，所以非常适合多个相同线程来处理同一份资源的情况，从而可以将CPU、代码和数据分开，形成清晰的模型，较好地体现了面向对象的思想。
 *
 * 劣势是：
 *
 * 编程稍微复杂，如果要访问当前线程，则必须使用Thread.currentThread()方法。
 *
 * 使用继承Thread类的方式创建多线程时优势是：
 *
 * 编写简单，如果需要访问当前线程，则无需使用Thread.currentThread()方法，直接使用this即可获得当前线程。
 *
 * 劣势是：
 *
 * 线程类已经继承了Thread类，所以不能再继承其他父类。
 */


public class createThread {


    public static void main(String[] args) {
        /**
         * 创建thread的子类 覆盖它的run方法
         */
        Thread thread=new Thread(){
            @Override
            public void  run(){
                while(true){
                try {
                    Thread.sleep(500);
                }catch (Exception e){
                    throw new RuntimeException();
                }
                System.out.println("thread1:"+Thread.currentThread().getName());
            //    System.out.println("2:"+this.getName());
              }
            }
        };
        //开始运行线程
        thread.start();

        /**
         * 常用的方式  更能体现面向对象
         *
         */
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try{
                        thread.sleep(500);
                    }catch (Exception e){
                        System.out.println("err:"+e.getMessage());
                    }
                    System.out.println("thread2:"+Thread.currentThread().getName());
                }
            }
        });
        thread2.start();
    }
}
