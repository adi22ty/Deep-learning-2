public class Day5 {
    // static int binarySearch(int arr[],int num){
    //     int low=0,high=arr.length-1;
    //     int mid=0;
    //     while(low<=high){
    //         mid=(low+high)/2;
    //         if(arr[mid]==num)
    //         return mid;
    //         else if (arr[mid]<num){
    //             low=mid+1;
    //         }else
    //         high=mid-1;

    //     }
    //     return-1;

    // }



    // public static int lowerBound(int[] arr,int num){
    //     int firstOccurence=-1;
    //     int low=0,high=arr.length-1,mid=0;
    //     while(low<=high){
    //         mid=(low+high)/2;
    //         if(arr[mid]==num){
    //             firstOccurence=mid;
    //             high=mid-1;
    //         }else if(arr[mid]>num){
    //             high=mid-1;
    //         }else
    //         low=mid+1;


    //     }
    //     return firstOccurence;
    // }


    public static int upperBound(int[] arr,int num){
        int ans=1;
        int low=0,high=arr.length-1,mid=0;
        while(low<=high){
            mid=(high+low)/2;
            if(arr[mid]==num){
                ans=mid+1;
                low=mid+1;
            }else if(arr[mid]>num){
                high=mid-1;
            }else
            low=mid+1;
        }
        return ans;

    }
    // public static int countOccurences(int []arr,int num){
    //     int lB=lowerBound(arr,num);
    //     if(lB==-1) return 0;
    //     int uB=upperBound(arr,num);
    //     return uB-lB;

        
    // }

    // public static void bubbleSort(int[] arr){
    //     for(int turn=1;turn<arr.length;turn++){
    //         for(int i=0;i<arr.length-turn;i++){
    //             if(arr[i]>arr[i+1]){
    //                 int temp=arr[i];
    //                 arr[i]=arr[i+1];
    //                 arr[i+1]=temp;
    //             }
    //         }
    //     }
    // }
    static void display(int [] arr){
        for(int i:arr) System.out.print(i+" ");
        System.out.println();
    }
        









    public static void main(String args []){
        // int [] arr={2,4,5,7,3,1,9,6};
        // bubbleSort(arr);
        // display(arr);




        // int num=6;
        // int arr[]={1,2,3,4,5,5,6,6,6,6,6,7,8,9,9,9,9};
        // System.out.println(countOccurences(arr,num));





        int num=3;
        int[] arr={1,2,3,3,5,6,7,8,9};
        System.out.println(upperBound(arr,num));





        // int num=2;
        // int [] arr={1,2,3,3,5,6,7,8,9};
        // System.out.println(lowerBound(arr,num));



        // int num=0;
        // int[] arr={1,2,3,4,5,6,7,8,9};
        // System.out.println(binarySearch(arr,num));


    }
    
}
