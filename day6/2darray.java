import java.util.*;
class Covid {
  public static void main(String[] args) {
    int m,n,i,k;

    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the number of days to track");
    m=sc.nextInt();

    System.out.println("Enter the number of cases improvement");
    n=sc.nextInt();

        int countCovid[][]=new int[m][n];

    for ( i=0;i<m;i++){
      for (k=0;k<n;k++){
        countCovid[i][k]=sc.nextInt();
      }
    }

        for ( i=0;i<m;i++){
      for (k=0;k<n;k++){
        System.out.print(countCovid[i][k]+" ");
      }
          System.out.print("\n");
     
    }

  }
}