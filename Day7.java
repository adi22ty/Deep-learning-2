import java.util.Scanner;

public class Day7 {
    // kadanes algorithm
    // static int maxsubarray(int arr[]){
    //     int maxsum=Integer.MIN_VALUE;
    //     int currentsum=0;
    //     for(int i=0;i<arr.length;i++){
    //         currentsum=currentsum+arr[i];
    //         maxsum=Integer.max(maxsum,currentsum);
    //         if(currentsum<0){
    //             currentsum=0;
    //         }

    //     }
    //     return maxsum;
       
    // }

    // rotate array
    // public static void rotate(int nums[],int k){
    //     int n=nums.length;
    //     k%=n;
    //     int [] temp=new int [nums.length];
    //     for (int i=0;i<n-k;i++)
    //     temp[i+k]=nums[i];
    //     for(int j=0;j<k;j++)
    //     temp[j]=nums[n-k+j];
    //     for(int i=0;i<n;i++)
    //     nums[i]=temp[i];

        
    // }
    // static void display(int [] arr){
    //     for(int i:arr) System.out.print(i+" ");
    //     System.out.println();
    // }

    // static int [] NGER(int []arr){
    //     int maxElement=0;
    //     int[] NGER=new int [arr.length];
    //     for(int i=arr.length-1;i>=0;i--){
    //         NGER[i]=maxElement;
    //         maxElement=Math.max(maxElement,arr[i]);
    //     }
    //     return NGER;


    // }

    // static void display(int [] arr){
    //     for(int i:arr) System.out.print(i+" ");
    //     System.out.println();
    // }

    // static int [] NGEL(int [] arr){
    //     int maxElement=0;
    //     int[] NGEL=new int [arr.length];
    //     for(int i=0;i<arr.length;i++){
    //         NGEL[i]=maxElement;
    //         maxElement=Math.max(maxElement,arr[i]);
    //     }
    //     return NGEL;
    // }

    // static int[] nser(int [] arr){
    //     int [] NSER=new int [arr.length];
    //     int minElement=Integer.MAX_VALUE;
    //     for(int i=arr.length-1;i>=0;i--){
    //         if(minElement==Integer.MAX_VALUE)
    //             NSER[i]=0;
    //         else
    //             NSER[i]=minElement;
    //         NSER[i]=minElement;
    //         minElement=Math.min(minElement,arr[i]);
    //     } 
    //     return NSER;
   
    // // }
    
    // another method to rotate the array

    // public static void rotatearray(int nums[],int k){
    //     // int n=nums.length;
    //     int temp []= new int [nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         temp[(i+k)%nums.length]=nums[i];
            
    //     }
    //     for(int i=0;i<nums.length;i++){
    //         nums[i]=temp[i];
    //     }
        
        
       
        


    // }
    // static void display(int [] arr){
    //     for(int i:arr) System.out.print(i+" ");
    //     System.out.println();
    // }

    // public static int repeatedsubarray(int arr1[],int arr2[]){
    //     int n1=arr1.length;
    //     int n2=arr2.length;
    //     int[][] dp = new int[n1 + 1][n2 + 1];
    //     int maxlength=0;
    //     for (int i = 1; i <= n1; i++) {
    //         for (int j = 1; j <= n2; j++) {
    //             if (arr1[i - 1] == arr2[j - 1]) {
    //                 dp[i][j] = dp[i - 1][j - 1] + 1;
    //                 maxlength = Math.max(maxlength, dp[i][j]);
    //             }
    //         }
    //     }
        
    //     return maxlength;




    // }

    public static int countsubarray(int arr[],int k){
        if (k <= 1) return 0;
        
        int product = 1, result = 0, left = 0;
        
        for (int right = 0; right < arr.length; right++) {
            product *= arr[right];
            
            while (product >= k) {
                product /= arr[left++];
            }
            
            result += (right - left + 1);
        }
        
        return result;
    

    }

    

    
            
        
        

   

    
    

        



    
    public static void main(String[] args) {
        // int nums[]={1,2,3,4,5,6,7};
        // Scanner sc=new Scanner(System.in);
        // int k=sc.nextInt();
        // rotatearray(nums,k);
        // display(nums);

     



        // int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        // System.out.println(maxsubarray(arr));

        // int nums[]={1,2,3,4,5,6,7};
        // Scanner sc=new Scanner(System.in);
        // int k=sc.nextInt();
        // rotate(nums,k);
        // display(nums);

        // int arr[]={7,1,5,3,6,4};
        // int[] num=NGER(arr);
        // for(int i:num) System.out.print(i+" ");
        // System.out.println();

        // int arr[]={3,7,2,5,8,4,9,1,6};
        // int[] num=NGEL(arr);
        // for(int i:num) System.out.print(i+" ");
        // System.out.println();

        // int arr[]={9,6,4,1,7,3,5,2,8};
        // int [] num=nser(arr);
        // for(int i:num) System.out.print(i+" ");
        // System.out.println();

        // Scanner sc=new Scanner(System.in);
        // int n1=sc.nextInt();
        // int [] arr1=new int[n1];
        // for(int i=0;i<n1;i++){
        //     arr1[i]=sc.nextInt();
        // }
        // int n2=sc.nextInt();
        // int [] arr2=new int[n2];
        // for(int i=0;i<n2;i++){
        //     arr2[i]=sc.nextInt();
        // }
        // int result=repeatedsubarray(arr1,arr2);
        // System.out.println("result");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=countsubarray(arr,k);
        System.out.println(result);

      




        




    }
       
       
        
    }
    

