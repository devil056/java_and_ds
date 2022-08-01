abstract class Bike{
    int speed;
    int mileage;
    String brand;
    Bike(int speed,int mileage,String brand){
        this.speed=speed;
        this.mileage=mileage;
        this.brand=brand;
    }
    abstract void printSpecs();
}

class RoyalEnfield extends Bike{
    RoyalEnfield(int speed,int mileage){
        super(speed,mileage,"Royal Enfield");
    }
    @Override
    void printSpecs() {
        System.out.println(this.brand+" "+this.speed+" "+this.mileage);
    }
}

class Triumph extends Bike{
    Triumph(int speed,int mileage){
        super(speed,mileage,"Triumph");
    }
    @Override
    void printSpecs() {
        System.out.println(this.brand+" "+this.speed+" "+this.mileage);
    }
}

class Jawa extends Bike{
    Jawa(int speed,int mileage){
        super(speed,mileage,"Jawa");
    }
    @Override
    void printSpecs() {
        System.out.println(this.brand+" "+this.speed+" "+this.mileage);
    }
}

class Test101{
    public static void main(String args[]){
        Bike b1=new RoyalEnfield(200,25);
        b1.printSpecs();
        Bike b2=new Triumph(180,20);
        b2.printSpecs();
        Bike b3=new Jawa(150,39);
        b3.printSpecs();
    }
}