public class whatsApp {
    String uName;
    String number;

    //getting the number of an obj
    public String getNumber() {
        return number;
    }

    //setting the value of number in an Obj.
    public void setNumber(String number) {
        this.number = number;
    }

    public void changeNumber(whatsApp w){
        w.number="+91"+w.number;
    }

    //Constructor without any parameters
    whatsApp(){
        System.out.println("This is with the no parms");
    }

    //Constructor with parameters
    whatsApp(String number){
        System.out.println("The number param constructor "+number);
    }

    //Assigning the values to the variables of class
    whatsApp(String name,String num){
        this.uName=name;
        this.number=num;
        System.out.println("Created object with the name: "+name+" & number: "+num);
    }
    //Copy constructor
    whatsApp(whatsApp w){
        number=w.number;
        uName=w.uName;
        System.out.println("The values of the given obj copied "+uName+" "+number);
    }
}

//Supporting class to test the points
//based on the different types of params passed different constructor will be executed
//also we can copy from one obj to another obj without disturbing the original values
//call by value is what we use , if we are to use the call by reference we might end up with the infinite loop
class Testing{
    public static void main(String[] args){
        whatsApp w1=new whatsApp();
        whatsApp w2=new whatsApp("9704331371");
        whatsApp w3=new whatsApp("Nagendra","8978088205");
        whatsApp w4=new whatsApp(w3);
        w4.setNumber("9866444426");
        System.out.println(w4.getNumber());
        System.out.println(w3.getNumber());
        System.out.println(w1);
        System.out.println(w2);
    }
}