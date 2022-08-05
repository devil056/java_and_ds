import java.util.regex.Pattern;

public class alphaNum {
    public static void main(String[] args){
        System.out.println(Pattern.matches("[a-zA-Z0-9]{9}","murari048"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9963565602"));
    }
}
