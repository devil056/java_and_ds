class ModArray {
    static void display(int arr[]){
        for(int item:arr){
            System.out.print(item+" ");
        }
        System.out.println();
    }
    static void modArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]/10;
        }
    }
    public static void main(String[] args){
        int arr[]={10,20,30,40,50,60};
        display(arr);
        modArray(arr);
        display(arr);
    }
}
