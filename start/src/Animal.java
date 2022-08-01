class Animal{
    void eat(){
        System.out.println("This animal eats");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("This animal barks");
    }
}

class Puppy extends Dog{
    void weeps(){
        System.out.println("This pup is weeping.");
    }
}

class Testing1{
    public static void main(String args[]){
        Puppy p1=new Puppy();
        p1.weeps(); //same class function call no issues
        p1.bark(); //super class function call
        p1.eat(); //not sure if this works out.
    }
}