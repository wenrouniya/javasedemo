package MyTest;

public class SynchronizedTest {


    public static void main(String[] args) {
        /**
         * 两个对象
         */
        ClassClock classClock1=new ClassClock();
        ClassClock classClock2=new ClassClock();
        new Thread(new Runnable() {
            @Override public void run() {

                    classClock1.clock1();
            }}).start();
        new Thread(new Runnable() {@Override
            public void run() {

            try {
                classClock2.clock2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }).start();
    }
}

