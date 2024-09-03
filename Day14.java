import java.util.Scanner;
public class Day14 {
    public static void main(String[] args) {
        // StringBuilder sb=new StringBuilder(10);
        // sb.append("hello");
        // sb.append( "hey");
        // sb.append("bye");
        // sb.ensureCapacity(100);
        // System.out.println(sb.capacity());
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] arr=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
    
        System.out.println();
       


    }
   

    
    
    }
}
