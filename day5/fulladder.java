class FullAdder{
    public static int addIterative(int a,int b){
        while(b!=0){
            int carry=(a&b);
            a=a^b;
            b=carry<<1;
        }
        return a;
    }
    public static void main(String[] args){
        System.out.println(addIterative(5,6));
    }
}