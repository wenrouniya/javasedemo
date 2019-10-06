package MultiThreadShareDate;

/**
 * 将共享数据放在runnable接口中
 */
public class Object1 {

    public static void main(String[] args) {
        shareRoom shareRoom=new shareRoom();
        new Thread(shareRoom).start();
        new Thread(shareRoom).start();
    }

}

class shareRoom implements  Runnable{

    private static int count =100;
    @Override
    public void run() {
        while (count>0){
            count--;
            System.out.println("当前线程为："+Thread.currentThread().getName()+"当前count的值为："+count);
        }
    }
}
