public class MultiThread2 implements Runnable{
    public void run(){
        System.out.println("Running thread.");
    }
    public static void main(String[] args){
        MultiThread2 r1=new MultiThread2();
        Thread t11=new Thread(r1);
        t11.start();
    }
}
