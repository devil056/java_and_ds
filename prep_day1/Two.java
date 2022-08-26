class Two {
    int ga=100;
    public static void main(String[] args){
        System.out.println("Hello world");
        Two a=new Two();
        a.funca();
    }
    public void funca(){
        int x=1;
        System.out.println(x);
        System.out.println(ga);
    }
}


class Bank{
    private int id;
    private int bal;
    public Bank(){

    }

    public void getValues(int i,int b){
        id=i;
        bal=b;
        return;
    }

    public void display(){
        System.out.println("id: "+id+" bal: "+bal);
        return;
    }

    public static void main(String[] args){
        Bank b=new Bank();
        b.display();
    }
}