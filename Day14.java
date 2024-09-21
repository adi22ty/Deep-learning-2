import java.util.Scanner;
public class Day14 {
     public static boolean toeplitiz (int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==matrix[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // StringBuilder sb=new StringBuilder(10);
        // sb.append("hello");
        // sb.append( "hey");
        // sb.append("bye");
        // sb.ensureCapacity(100);
        // System.out.println(sb.capacity());
        int matrix[][]={{1,2},{2,2}};
        System.out.println(toeplitiz(matrix));

    
    
    }
}
