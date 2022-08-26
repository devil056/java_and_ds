class Threadrunner extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello : "+i);
            try{
                Thread.sleep(500);
            } catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}

class Application{
    public static void main(String[] args){
        Threadrunner r1=new Threadrunner();
        r1.start();
        Threadrunner r2=new Threadrunner();
        r2.start();
    }
}