import java.util.Scanner;

public class Day7 {
    // kadane's algorithm
    static int maxsubarray(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
        for(int i=0;i<arr.length;i++){
            currentsum=currentsum+arr[i];
            maxsum=Math.max(maxsum,currentsum);
            if(currentsum<0){
                currentsum=0;
            }

        }
        return maxsum;
       
    }

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
    
    // Another method to rotate the array

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

    
    
 
 
    public static void main(String[] args) {
        // int nums[]={1,2,3,4,5,6,7};
        // Scanner sc=new Scanner(System.in);
        // int k=sc.nextInt();
        // rotatearray(nums,k);
        // display(nums);

     



        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxsubarray(arr));

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

        


    

    }
       
       
        
    }
    

