import java.util.*;
public class Day21 {
    static int[][] board;
    //display
    static void display(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }
    //Recursive Code
    static boolean nQueens(int[][] board, int i, int n){
        if(i==n){
            //display
            display(board);
            return true;
        }

        for(int j=0;j<n;j++){
            if(check(board, i, j, n)){
                board[i][j]=1;
                if(nQueens(board, i+1, n))
                    return true;
                //backtrack
                board[i][j]=0;
            }
        }
        return false;
    }
    //Check Safe
    static boolean check(int[][] board, int i, int j, int n){
        //col
        for(int k=0;k<i;k++)
            if(board[k][j]==1)
                return false;
        //left diagonal
        int x=i-1, y=j-1;
        while(x>=0 && y>=0){
            if(board[x--][y--]==1)
                return false;
        }
        //Right diagonal
        x=i-1; y=j+1;
        while(x>=0 && y<n){
            if(board[x--][y++]==1)
                return false;
        }
        return true;
    }

    


    // static boolean canPlace(int[][] mat, int i, int j, int n, int number){
    //     //for checking rows and cols
    //     for(int x=0;x<n;x++)
    //         if(mat[x][j]==number|| mat[i][x]==number)
    //             return false;
    //     //For Checking Subblock
    //     int rn= (int)Math.sqrt(n);
    //     int sx= (i/rn)*rn;
    //     int sy= (j/rn)*rn;
    //     //check inside a subblock
    //     for(int x=sx;x<sx+rn;x++)
    //         for(int y=sy;y<sy+rn;y++)
    //             if(mat[x][y]==number)
    //                 return false;
    //     //No issues with this number :)
    //     return true;
    // }

    // static boolean sudokusolver(int[][]mat,int i,int j,int n){
    //     if(i==n)
    //         return true; //found ans
    //     if(j==n)
    //         return sudokusolver (mat, i+1, 0, n);//out of bound
    //     if(mat[i][j]!=0) return sudokusolver(mat, i, j+1, n);//prefilled
    //     for(int num=1;num<=9;num++){
    //         if(canPlace(mat,i,j,n,num)){
    //             mat[i][j]=num;
    //             if(sudokusolver(mat, i, j+1, n))
    //             return true;
    //         }
    //     }
    //     //backtrack
    //     mat[i][j]=0;
    //     return false;

    // }
    public static void main(String[] args) {
        // int n=9;
        // Scanner sc=new Scanner(System.in);
        // int mat[][]=new int [n][n];
        // // input
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         mat[i][j]=sc.nextInt();
        //     }
        // }
        // sudokusolver(mat,0,0,n);
        // //display
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(mat[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // sc.close();

        int n=4;
        board=new int[n][n];
        nQueens(board,0,n);


        
    }
    
}
