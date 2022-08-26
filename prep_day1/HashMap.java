import java.util.HashMap;
class Hashmap {
    public static void main(String[] args){
        HashMap<String,Integer> ages=new HashMap<String,Integer>();
        ages.put("Murari",25);
        ages.put("Sukumar",24);
        System.out.println("Murari is "+ages.get("Murari")+" years old");
        System.out.println("Sukumar is "+ages.get("Sukumar")+" years old");
    }
}

class BankPrep{
    public static void main(String[] args){
        HashMap<String,String> aadhar=new HashMap<String,String>();
        aadhar.put("1234","9832 1234 1234");
        aadhar.put("7633","7815 1971 1234");
        System.out.println("Account num 1234 Aadhar:"+aadhar.get("1234"));
        System.out.println("Account num 7633 Aadhar:"+aadhar.get("7633"));
    }
}
