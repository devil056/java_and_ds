class Child1 extends Thread {
    public void run(){
        for (int i=1;i<=15;i++){
            System.out.println("P: "+Thread.currentThread().getPriority()+" Child 1 ");
        }
    }
}

class Child2 extends Thread {
    public void run(){
        for (int i=1;i<=15;i++){
            Thread.yield();
            System.out.println("P: "+Thread.currentThread().getPriority()+" Child 2 ");
        }
    }
}
class Child3 extends Thread {
    public void run(){
        for (int i=1;i<=15;i++){
            System.out.println("P: "+Thread.currentThread().getPriority()+" Child 3 ");
        }
    }
}
class yield_method{

    public static void main(String args[]){
        Child1 t1=new Child1();
        Child2 t2=new Child2();
        Child3 t3=new Child3();
        t1.start();
        t2.start();
        t3.start();

        for (int i=1;i<=5;i++){
            System.out.println("P: "+Thread.currentThread().getPriority()+" I am the parent ");
        }
    }

}