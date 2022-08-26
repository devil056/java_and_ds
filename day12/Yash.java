//import java.util.regex.MatchResult;
//
//class ResMatrix {
//    static int[][] arrRes = new int[2][2];
//}
//class Matrix{
//    int[][] arr=new int[2][2];
//    void setV(int v){
//        for(int i=0;i<2;i++){
//            for(int j=0;j<2;j++){
//                arr[i][j]=v;
//                v++;
//            }
//        }
//    }
//    int[][] getV(){
//        return arr;
//    }
//}
//class Mul extends Thread{
//    public int row;
//    public int col;
//    Matrix m1;
//    Matrix m2;
//    Mul(int row, int col, Matrix m1, Matrix m2){
//        this.row=row;
//        this.col=col;
//        this.m1=m1;
//        this.m2=m2;
//    }
//    public void run(){
//        int tmp=0;
//        for(int i=0;i<2;i++){
//            tmp=tmp+this.m1.getV()[row][i]*this.m1.getV()[row][i];
//        }
//        ResMatrix.arrRes[row][col]=tmp;
//        System.out.println("Starting thread end: "+Thread.currentThread().getName());
//    }
//}
//class Test{
//    public static void main(String[] args) throws InterruptedException{
//        long start = System.currentTimeMillis();
//        Matrix mm=new Matrix();
//        mm.setV(1);
//        Matrix mm1=new Matrix();
//        mm1.setV(2);
//        for(int i=0;i<2;i++){
//            for(int j=0;j<2;j++){
//                Mul mul=new Mul(i, j, mm, mm1);
//                mul.start();
//            }
//        }
//        for(int i=0;i<2;i++){
//            for(int j=0;j<2;j++){
//                System.out.println("Value: "+ResMatrix.arrRes[i][j]);
//            }
//        }
//        long stop = System.currentTimeMillis();
//        System.out.println("Threads execution time in milliseconds "+(stop-start));
//    }
//}