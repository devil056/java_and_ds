class A{
    protected int j=100;
    void print(){
        System.out.println("From class A");
    }
}

interface I{
    public static int i=555;
    void printInterface();
}

class B extends A implements I{
    public int val=999;

    @Override
    public void printInterface() {
        System.out.println("From Interface I");
    }

    public void printB(){
        super.print();
        System.out.println("From the class B own print");
    }
}

class SuperTest{
    public static void main(String[] args){
        B b=new B();
        b.print();
        b.printB();
    }
}