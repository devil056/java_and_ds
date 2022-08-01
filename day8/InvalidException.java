class InvalidException extends Exception {
    public InvalidException(String str){
        super(str);
    }
}
class TestCustomException{
    static void validate(int age) throws InvalidException{
        if(age<18){
            throw new InvalidException("Age is not valid");
        } else {
            System.out.println("Welcome to voting area");
        }
    }
    public static void main(String[] args){
        try{
            validate(13);
        } catch (InvalidException ex){
            System.out.println("Caught the exception");
            System.out.println("Exception occured");
        }
        System.out.println("End of the code execution");
    }
}