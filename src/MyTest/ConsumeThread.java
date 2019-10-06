package MyTest;

public class ConsumeThread extends  Thread {
    private Myservice2 myservice2;
    public ConsumeThread(Myservice2 myservice2){
        this.myservice2=myservice2;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
         myservice2.get();
        }
    }

}
