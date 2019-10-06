package MyTest;

import javax.tools.Tool;

public class ThreadLocalTest {
    public static void main(String[] args) {
      Myservice2 myservice2=new Myservice2();
      CreatThread creatThread=new CreatThread(myservice2);
      creatThread.start();
      ConsumeThread consumeThread=new ConsumeThread(myservice2);
      consumeThread.start();


    }

}
