public class FinalTesting{
    //once we assign a value to final variable, later on it cannot be changed.
    //once we assign a value to final variable, later on it cannot be changed.
    //final int speedLimit=50;
    int speedLimit=50;
    void run(){
        speedLimit=40;//expect an error in case we are to set the modifier as final for speedLimit
    }
    //Error we can expect => java: cannot assign a value to final variable speedLimit

    public static void main(String[] args){
        FinalTesting t=new FinalTesting();
        t.run();
    }
}