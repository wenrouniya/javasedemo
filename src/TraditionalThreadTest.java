import java.util.Timer;
import java.util.TimerTask;

public class TraditionalThreadTest {

    public static void main(String[] args) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("booling!111");
            }
        }, 500);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("booling!222");
            }
        }, 500,100);
    }
}
