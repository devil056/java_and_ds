class th extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Default priority");
        }
    }
}

class th2 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            Thread.currentThread().setPriority(8);
            Thread.yield();
            System.out.println("P: 8 with yield Thread 2");
        }
    }
}

class th3 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            Thread.currentThread().setPriority(9);
            System.out.println("P: 9 Thread 3");
        }
    }
}

class th4 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            Thread.currentThread().setPriority(8);
            System.out.println("P: 8 no yield Thread 4");
        }
    }
}

class Testing{
    public static void main(String[] args){
        th t1=new th();
        th2 t2=new th2();
        th3 t3=new th3();
        th4 t4=new th4();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}