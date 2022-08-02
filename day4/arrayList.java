import java.util.*;


class ArrayList1{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Amazon echo");
        list.add("Amazon kindle");
        list.set(1,"Amazon EC2");
        System.out.println(list);
    }
}