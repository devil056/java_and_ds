class runnable implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello from the thread : "+i);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}

class App{
    public static void main(String[] args){
        Thread r =new Thread(new runnable());
        r.start();
    }
}
