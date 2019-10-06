package Classload;

public class MyTest6 implements  Runnable{

    public Thread thread;
    public MyTest6(){
        thread=new Thread(this);
        thread.start();
    }


    @Override
    public void run(){
     ClassLoader  loader =this.thread.getContextClassLoader();
     this.thread.setContextClassLoader(loader);

        System.out.println("currentLoader:"+loader.getClass());

        System.out.println("parent:" + loader.getParent().getClass());
    }

    public static void main(String[] args) {
        new MyTest6();
    }
}
