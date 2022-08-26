import javax.naming.ServiceUnavailableException;

class SynchronizedBlock {

    public void wish(String name){

        synchronized (this){

            for(int i=0;i<5;i++){
                System.out.println("Good Morning:");
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){

                }
                System.out.println(name);
            }
        }
    }

}

class MyThread extends  Thread{
    SynchronizedBlock d;
    String name;
    MyThread(SynchronizedBlock d,String name){
        this.d=d;
        this.name=name;
    }

    public void run(){
        d.wish(name);
    }
}
class finalBlock{
    public static void main(String args[]){
        SynchronizedBlock b1=new SynchronizedBlock();
        MyThread t1= new MyThread(b1,"Murari");
        MyThread t2= new MyThread(b1,"Nagendra");
        t1.start();
        t2.start();
    }
}