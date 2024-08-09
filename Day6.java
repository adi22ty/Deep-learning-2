import java.util.Arrays;
public class Day6 {
    // static void selectionSort(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         int idx=minimumValue(arr,i);
    //         int temp=arr[i];
    //         arr[i]=arr[idx];
    //         arr[idx]=temp;
    //     }
    // }
    // static int minimumValue (int[] arr,int a){
    //     int mini=a;
    //     for(int i=a+1;i<arr.length;i++)
    //     if(arr[mini]>arr[i])
    //     mini=i;
    //     return mini;
    // }

    static void display(int [] arr){
        for(int i:arr) System.out.print(i+" ");
        System.out.println();
    }

    // public class InsertionSort{
        // static void display(int [] arr){
        //     System.out.print(i+" ");
        // }

        static void insertionSort(int [] arr){
            for(int i=1;i<arr.length;i++){
                int key=arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    --j;
                }
                arr[j+1]=key;
            }

         
        }
    
       






    public static void main(String args []){
        int [] arr={1,2,4,6,5,3,9};
        // insertionSort(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,4));
        display(arr);
      
       


    }
    
}
