class prep101 {
    static void rev(int num){
        if(num>0){
            rev(num-1);
            System.out.print(num+" ");
            rev(num-1);
            System.out.print(num+" ");
            rev(num-1);
        }
    }
    public static void main(String[] args){
        rev(3);
    }
}
