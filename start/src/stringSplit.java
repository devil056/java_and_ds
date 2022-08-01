class StringSplit{
    public static void main(String[] args){
        String s1="Sarah Jane Taylor,Jhulan Nishit Goswami,Katherine Helen Brunt,Mehgann Lanning,Mithali Dorai Raj,David Grace Raj";
        String[] arr=s1.split(",");
        for(String k:arr){
            String[] intermediate=k.split(" ");
            if(intermediate.length==3){
                System.out.println(intermediate[1]);
            }else{
                System.out.println("NULL");
            }
        }
    }
}