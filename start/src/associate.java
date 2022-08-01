class Amazon {
    //constructor
    Amazon(){
        System.out.println("First class in my code");
    }
    void servicesProvided(){
        System.out.println("Amazon is product based and aswell provides cloud computing servers");
    }
}

class AWS extends Amazon{
    public int costOfRunningPerHour=9;
    AWS(){
        System.out.println("Second class in my code");
    }
    void cloudServer(){
        System.out.println("The server we are currently running is hosted by Amazon.");
    }
}

class EC2 extends AWS{
    public int hoursTheServerIsUp;
    EC2(){
        System.out.println("Final class in my code");
    }
    EC2(int x){
        this.hoursTheServerIsUp=x;
        System.out.println("The server is up for :"+this.hoursTheServerIsUp+"Hrs");
    }
    void instance(){
        System.out.println("The server is running on the instance of the EC2");
    }
}

class Testing121{
    public static void main(String[] args){
        EC2 e=new EC2(9);
        e.servicesProvided(); //Super parent I guess not sure
        e.cloudServer(); // Parent this is something m sure of
        e.instance(); // Same class func
    }
}
