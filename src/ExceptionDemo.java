import jdk.jfr.Experimental;

public class ExceptionDemo {
    static void voteEligiblity(int age){
        if(age<18){
            try{
                throw new Exception();
            } catch (Exception e){
                System.out.println("You are not an adult and so not eligible to vote.");
            }
        } else {
            System.out.println("You can vote");
        }
    }
    public static void main(String[] args){
        voteEligiblity(19);
        voteEligiblity(16);
    }
}
