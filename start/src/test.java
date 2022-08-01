class StringTen{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("This is a sentence with multiple words");
        System.out.println("sb "+sb);
        int index=sb.indexOf("sentence");
        System.out.println(index);
        sb.append("t");
        System.out.println(sb);
    }
}