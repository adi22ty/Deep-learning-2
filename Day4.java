import java.util.*;



public class Day4 {
   
static void swap(int [] arr,int i, int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    
    }
    
    static void reverseUsingswap(int[] arr){
        for(int i=0, j=arr.length-1;i<j;j--,i++){
        swap(arr,i,j);
    

        
    }
}
static void PrintArr(int []arr){
    for(int i:arr){
        System.out.print(i+" ");
    }
    System.out.println();
}
static boolean binarysearch(int[] arr,int n){
    int i=0, j=arr.length-1;
    while(i<=j){
        int mid=(i+j)/2;
        if(arr[mid]==n) return true;
    else if(arr[mid]<n) i=mid+1;
    else j=mid-1;

}
return false;
}
 

    
    

    

    





    public static void main(String args []){
        int []arr ={1,3,2,9,5,7,10};
        System.out.println(binarysearch(arr,3));
        

    }
}
    

