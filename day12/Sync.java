class Syntesting {
    synchronized void printTable(int n){
        for (int i=1;i<=10;i++){

            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){
                System.out.println("Error occurred");
            }
        }
    }
}
class MyThread1 extends Thread{
    Syntesting t1;
    MyThread1(Syntesting t1){
        this.t1=t1;
    }

    public void run(){
        t1.printTable(5);
    }
}


class MyThread2 extends Thread{
    Syntesting t1;
    MyThread2(Syntesting t1){
        this.t1=t1;
    }

    public void run(){
        t1.printTable(100);
    }
}

class TestSynchronization1{
    public  static void main(String[] args){
        Syntesting obj=new Syntesting();
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        t2.start();
    }
}