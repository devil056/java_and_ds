interface QA{
    default void printQA(){
        System.out.println("This is the QA");
    };
}

interface Developer{
    default void printDev(){
        System.out.println("This is the DEV");
    };
}

class Test101 implements QA,Developer{
    public static void main(String[] args){
        Test101 t=new Test101();
        t.printQA();
        t.printDev();
    }
}