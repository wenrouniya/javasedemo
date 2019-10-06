package MyTest;

public class ClassClock {
   synchronized public  static  void clock1() {
        System.out.println(Thread.currentThread().getName()+"clock1---start------");
       try {
           Thread.sleep(500);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       System.out.println(Thread.currentThread().getName()+"clock1---end-------");
    }
   synchronized public static void  clock2() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" clock2----start------");
        Thread.sleep(500);
        System.out.println(Thread.currentThread().getName()+"clock2-----end-------");
    }
}
