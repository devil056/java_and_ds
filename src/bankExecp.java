class Banking{
    int balance;
    String userName;
    Banking(int balance,String user){
        this.balance=balance;
        this.userName=user;
    }
    void withdrawAmount(int withdrawAmount){
        try{
            if(this.balance<withdrawAmount){
                throw new Exception();
            } else {
                this.balance-=withdrawAmount;
                System.out.println("Withdraw is successful.");
            }
        }catch(Exception e){
            System.out.println("Insufficient balance.");
            System.out.println("Please select amount with in the range of available balance");
        }
    }
    void checkBalance(){
        System.out.println("Hello "+this.userName+". The available balance is: "+this.balance);
    }
    public static void main(String[] args){
        Banking b=new Banking(20000,"Murari");
        b.withdrawAmount(2000);
        b.checkBalance();
    }
}
