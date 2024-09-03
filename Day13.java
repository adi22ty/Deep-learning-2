import java.util.*;
public class Day13 {
    // static void populate(int [][]nums){
    //     int n=1;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=0;j<nums[0].length;j++){
    //             nums[i][j]=n;
    //             n++;
    //         }

    //     }
    // }

    static void display(int [][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
       
       
    }
    // public static int sum(int [][]nums){
    //     int sum=0;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=0;j<nums[0].length;j++){
    //             sum=sum+nums[i][j];
    //         }
    //     }
    //     return sum;

    // }

    // static int [] search(int[][] nums,int n){
    //     int[] ans=new int[2];
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=0;j<nums[0].length;j++){
    //             if(nums[i][j]==n){
    //                 ans[0]=i;
    //                 ans[1]=j;
    //                 return ans;
    //             }


    //         }
    //     }
    //     return ans;
    // }

    // static void swap(int nums[][]){
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=0;j<i;j++){
    //             int temp=nums[i][j];
    //             nums[i][j]=nums[j][i];
    //             nums[j][i]=temp;
               

    //         }
    //     }
        
    // }

    static void sortbyrows(int [][] nums){
        for(int i=0;i<nums.length;i++){
            Arrays.sort(nums[i]);
        }
    }

    static


    public static void main(String[] args) {
        // int arr={1,2,3};
        int [][] nums=new int [4][4];
        // int [][][] grid=new int [4][2][1];
        // int [][] nums={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        // System.out.println(nums[0][1]);
        // System.out.println(nums[1]);
        // System.out.println(nums[2]);
    //    populate(nums);
    //    display(nums);


   
    display(nums);
    // System.out.println(sum(nums));

    // int []indices=search(nums, 7);
    // System.out.println("i"+indices[0]+"j"+indices[1]);

    // swap(nums);
    // display(nums);

    sortbyrows(nums);
    display(nums);


     
    }
    
}
