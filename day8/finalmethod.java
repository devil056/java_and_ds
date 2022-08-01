class FinalMethod {
    //methods with the final access modifier cannot be changed
    /*final*/ void run(){
        System.out.println("Running..");
    }
}

class Honda extends FinalMethod{
    //Expected error => java: run() in Honda cannot override run() in FinalMethod
    //  overridden method is final
    void run(){
        System.out.println("Great company.");
    }
    public static void main(String[] args){
        FinalMethod f=new Honda();
        f.run();
    }
}