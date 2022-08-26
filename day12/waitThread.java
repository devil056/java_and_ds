class ThreadB extends Thread {

    int tot=0;

    public void run(){

        synchronized (this){
            System.out.println("Child thread start calculation");

            for (int i=1;i<=100;i++){
                tot+=i;
            }
            System.out.println("Child thread trying to give notification");
            this.notify();
        }
    }
}
class InterThreadCommunication{
    public static void main(String[] args) throws InterruptedException{
        ThreadB b1=new ThreadB();
        b1.start();
        synchronized (b1){
            System.out.println("main thread to call wait method");
            b1.wait();

            System.out.println("main thread got notification");
            System.out.println(b1.tot);

        }
    }
}