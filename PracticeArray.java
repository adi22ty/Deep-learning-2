import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PracticeArray {
    // Arraysbinary
    // static int  arraysbinary(int []arr,int target){
    //     int low=0;
    //     int high=arr.length;
    //     int mid=0;
    //      mid=(low+high)/2;
    //      while(low<=high){
    //      if(arr[mid]==target){
    //         return mid;
    //      }
    //         else if(arr[mid]<target){
    //             low=mid+1;
    //         }else{
            
    //             high=mid-1;
    //         }
    //     }
    //     return-1;
    // }
            
     

         
         

    // }
    // bubble sort
    // public static void bubbleSort( int[] arr){
    //     for(int turn= 1;turn<arr.length;turn++){
    //         for( int i=0; i<arr.length-turn;i++){
    //             if(arr[i]>arr[i+1]){
    //             int temp=arr[i];
    //             arr[i]=arr[i+1];
    //             arr[i+1]=temp;
    //             }
    //         }
    //     }
    // }
    
    // LEETCODE-702
    // static int binarysearch(int []nums,int target){
    //     int low=0;
    //     int high=nums.length-1;
    //     while(low<=high){
    //         int mid=high-(high-low)/2;
    //         if(nums[mid]==target){
        
    //             return mid;
    //         }
    //         else if(nums[mid]<target){
    //             low=mid+1;
    //         }
    //         else{
    //             high=mid-1;
    //         }
    //     }
    //     return -1;

    // }

    // public static int peakarray(int arr[]){
    //     int low=0;
    //     int high=arr.length-1;
    //     int mid=high-(high-low)/2;
    //     while(low<high){
    //         if(arr[mid]<arr[mid+1]){
    //             low=mid+1;
    //         }
    //         else{
    //             high=mid;
    //         }
    //         mid=high-(high-low)/2;
    //     }
    //     return low;
    // }

    // public static List<Integer> targetindices (int nums[],int target){
    //     Arrays.sort(nums);
    //      List<Integer> result = new ArrayList<>();
    //      for(int i=0;i<nums.length;i++){
    //         if(nums[i]==target){
    //             result.add(i);
    //         }
    //      }
    //      return result;

    // }

    // public static int peak(int arr[]){
    //     for(int i=1;i<arr.length-1;i++){
    //         if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static int longestsubarray(int []nums){
    //     int left = 0;
    //     int zeroCount = 0;
    //     int maxLength = 0;

    //     for (int right = 0; right < nums.length; right++) {
    //         if (nums[right] == 0) {
    //             zeroCount++;
    //         }
    //         while (zeroCount > 1) {
    //             if (nums[left] == 0) {
    //                 zeroCount--;
    //             }
    //             left++;
    //         }
    //         maxLength = Math.max(maxLength, right - left+1);
            
        
    // }
//     return maxLength -1;

// }
// first and last position of element in array
// public static int[] searchRange(int[] nums, int target) {
//     int[] result = new int[2];
//         result[0] = firstocc(nums, target);
//         result[1] = lastocc(nums, target);
//         return result;
//     }



// public static int firstocc(int nums[],int target){
//     int low=0;
//     int high=nums.length-1;
//     int ans=-1;
//     while(low<=high){
//         int mid=(low+high)/2;
//         if(nums[mid]==target){
//            ans= mid;
//            high=mid-1;
//         }
//         else if(target>nums[mid]){
//             low=mid+1;
//         }
//         else{
//             high=mid-1;
//         }
       
//     }
//     return ans;
// }
// public static int lastocc(int []nums,int target){

// int low=0;
//     int high=nums.length-1;
//     int ans=-1;
//     while(low<=high){
//         int mid=(low+high)/2;
//         if(nums[mid]==target){
//            ans= mid;
//            low=mid+1;
//         }
//         else if(nums[mid]<target){
//             low=mid+1;
//         }
//         else{
//             high=mid-1;
//         }
       
//     }
//     return ans;
// }

// public static boolean searchmatrix(int [][] matrix,int target){
//     int m=matrix.length;
//     int n=matrix[0].length;
//     for(int i=0;i<m;i++){
//         for(int j=0;j<n;j++){
//             if(matrix[i][j]==target){
//                 return true;
//             }
//         }
//     }
//     return false;

// }

// public static int peakarray(int nums[]){
//     int low=0;
//     int high=nums.length-1;
//     while(low<=high){
//         int mid=high-(high-low)/2;
//         if(nums[mid]<nums[mid+1]){
//             low=mid+1;
//         }
//         else{
//             high=mid-1;
//         }
//     }
//     return low;

// }

// public static int targetindices(int []nums,int target){
//     Arrays.sort(nums);
//     int low=0;
//     int high=nums.length-1;
//     while(low<=high){
//         int mid=high-(high-low)/2;
//         if(nums[mid]==target){
//             return mid;

//         }
//         else if(nums[mid]<target){
//             low=mid+1;
//         }
//         else{
//             high=mid-1;
//         }
//     }
//     return -1;
// }

// public static int peakarray2(int nums[]){
//     int low=0;
//     int high=nums.length-1;
//     while(low<high){
//         int mid=high-(high-low)/2;
//         if(nums[mid]<nums[mid+1]){
//             low=mid+1;
//         }
//         else{
//            high=mid;
//         }

//     }
//     return low;
// }

// public static boolean searchmatrix(int[][] matrix,int target){
//     for(int i=0;i<matrix.length;i++){
//         for(int j=0;j<matrix[0].length;j++){
//             if(matrix[i][j]==target){
//                 return true;
//             }
            
//         }
//     }
//     return false;
// }
public static int reverse(int num[]){
    int rev=0;
    for(int i=num.length-1;i<0;i++){
        rev=rev+num[i];
    }
    return rev;
}




    public static void main(String arg[]){
        // int[] nums = {5, 7, 7, 8, 8, 10};
        // int target = 8;
        // int[] result = searchRange(nums, target);
        // System.out.println(result[0]);
        // System.out.println(result[1]);





        // int []nums={1, 1, 0, 1};
        // System.out.println(longestsubarray(nums));

        // int []arr={0,1,0};
        // System.out.println(peak(arr));


        // int nums[]={1,2,5,2,3};
        // int target=2;
        // System.out.println(targetindices(nums,target));




        // int [] nums={-1,0,3,5,9,12};
        // int target=9;
        // System.out.println(binarysearch(nums,target));


        // int [] arr={0,1,0};
        // System.out.println(peakarray(arr));
      
        
     
       
      

        

        // int  [] a ={3,5,6,9,78};
        // int target=6;
        // System.out.println(arraysbinary(a, target));
       
        
        


        // int[] age= new int[5];
        // age[0]=20;
        // age[1]=25;
        // age[2]=30;
        // age[3]=35;
        // age[4]=40;

        //  using for loop 

        // for(int i=0;i<=4;i++){
        //     System.out.println(age[i]);
        // }

        // using for each loop
        // for(int x:age){
        //     System.out.println(x);

        // }

        // using while loop
        // int i=0;
        // while(i<=4){
        //     System.out.println(age[i]);
        //     i++;
        // }



        // System.out.println(age[0]);
        // System.out.println(age[1]);
        // System.out.println(age[2]);
        // System.out.println(age[3]);
        // System.out.println(age[4]);

        // int[] age ={20,30,40,50};
        // System.out.println(age[1]);

        // int [] [] multiarray={{10,20,30},{40,50,60},{70,80,90}};
        // System.out.println(multiarray[0][0]);
        // System.out.println(multiarray[0][1]);
        // System.out.println(multiarray[0][2]);

        // System.out.println(multiarray[1][0]);
        // System.out.println(multiarray[1][1]);
        // System.out.println(multiarray[1][2]);

        // String [] name ={"java","python","html","css"};
        // System.out.println(name.length);

        // Question1-calculate the sum of array {1,2,3,4,5};
        // int arr[]={1,2,3,4,5};
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum=sum+arr[i];
        // }
        // System.out.println(sum);

        // find number of elements in an array:
        // int [] marks ={90,95,100,98,99};
        // System.out.println(marks.length);


        //user input in array
        // Scanner sc =new Scanner(System.in);
        // int [] marks=new int [5];
        // for(int i=0;i<marks.length;i++){
        //     System.out.print("enter the marks");
        //     marks[i]=sc.nextInt();

        // }
        // for(int i=0;i<marks.length;i++){
        //     System.out.println(marks[i]);

        // }
        // int nums[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        // int target=3;
        // int nums[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        // int target=5;
        // System.out.println(searchmatrix(nums,target));

        // int nums[]={0,1,0};
        // System.out.println(peakarray(nums));

        // int nums[]={1,2,5,2,3};
        // int target=3;
        // System.out.println(targetindices(nums, target));

        // int nums[]={1,2,3,1};
        // System.out.println(peakarray2(nums));

        // int [][] nums={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        // int target=2;
        // System.out.println(searchmatrix(nums, target));

        int num[]={1,2,3,4,5};
        System.out.println(reverse(num));


        

   

        
       


      


        

        



        



    }


}
    