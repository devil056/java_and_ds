class Bank{
    float getInterestRate(){
        return 0.0f;
    }

    void accessMethods(){
        System.out.println("Does not have any pre built apps or webpage to access.");
    }
}

class ICICI extends Bank{
    float getInterestRate(){
        return 5.0f;
    }
    void accessMethods(){
        System.out.println("ICICI has the mobile app and the web page to access your account or Demat account.");
    }
}

class HDFC extends Bank{
    float getInterestRate(){
        return 9.3f;
    }
    void accessMethods(){
        System.out.println("HDFC has the mobile app and the web page to access your account but not for Demat account.");
    }
}

class Testing1{
    public static void main(String args[]){
        Bank b1=new ICICI();
        System.out.println("The rate of interest of ICICI: "+b1.getInterestRate());
        b1.accessMethods();
        Bank b2=new HDFC();
        System.out.println("The rate of interest of HDFC: "+b2.getInterestRate());
        b2.accessMethods();
        Bank b3=new Bank();
        System.out.println("The rate of interest of Base Bank: "+b1.getInterestRate());
        b3.accessMethods();
    }
}