class Child extends Thread {
    public void run(){
        System.out.println("C: "+Thread.currentThread().getPriority());
    }
}

//by default the priority of any thread is 5, you can set it to any number from 1 to 10
//child priority is the same as parent

class Parent_Child_Priority{
    public static void main(String [] args){
        System.out.println("Here are default child and parent priority");
        Thread.currentThread().setPriority(9);
        Child t1=new Child();
        t1.start();
        System.out.println("P: "+Thread.currentThread().getPriority());
    }
}