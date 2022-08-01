public class customExec {
    public static void main(String[] args){
        int i=0;
        String greeting[]={"Hello","amazon","Redbus"};
        while(i<4){
            try{
                System.out.println(greeting[i]);
                ++i;
            } catch (Exception e){
                System.out.println(e.toString());
            } finally {
                System.out.println("Hello!");
                if(i<3){

                } else {
                    System.out.print("You should quit now");
                }
            }
        }
    }
}
