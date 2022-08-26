class MatrixMultWithThread3 {
    static int[][] arrres=new int[100][100];
}
class matrix3{
    int[][] arr=new int[100][100];
    void setV(int v){
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                arr[i][j]=v;
                v+=1;
            }
        }
    }

    int[][] getV(){
        return arr;
    }
}
class Mul3 {
    public int row;
    public int col;
    matrix3 m1;
    matrix3 m2;
    Mul3(int row, int col, matrix3 m1, matrix3 m2){
        this.row=row;
        this.col=col;
        this.m1=m1;
        this.m2=m2;
    }
    public void run(){
        int temp=0;
        for (int i = 0; i < 100; i++) {
            temp=temp+m1.getV()[row][i]*m1.getV()[row][i];
            MatrixMultWithThread3.arrres[row][col]=temp;
        }
    }
}
class Test3{
    public static void main(String[] args)throws InterruptedException{
        long start = System.currentTimeMillis();
        matrix3 mat1=new matrix3();
        mat1.setV(1);
        matrix3 mat2=new matrix3();
        mat1.setV(2);
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                Mul3 mul=new Mul3(i,j,mat1,mat2);
                mul.run();
            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println("Value : "+ MatrixMultWithThread3.arrres[i][j]);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Time : "+(end-start));
    }
}