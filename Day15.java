import java.util.ArrayList;

public class Day15 {
     static ArrayList<Integer> findSubArray(int []arr,int k){
        int start=0;
        int end=k-1;
        int maxsum=0;
        for(int i=0;i<=end;i++){
            maxsum=maxsum+arr[i];
        }
        int currsum=maxsum;
        int index=0;
        while(end<arr.length){
            currsum=currsum-arr[start];
            start++;
            end++;
            currsum=currsum+arr[end];
            if(maxsum<currsum){
                index=start;
                maxsum=currsum;
            }
        }

        ArrayList<Integer>nums=new ArrayList<>();
        for(int i=index;i<index+k;i++){
            nums.add(arr[i]);
        }



     }
    public static void main(String[] args) {
        // 1-syntax
        ArrayList<Integer> arr=new ArrayList<>(); 

        // 2-add
        // arr.add(10);
        // arr.add(20);
        // arr.add(30);
        // System.out.println(arr);
        // System.out.println(arr.size());

        // 3-get
        // System.out.println(arr.get(0));

        // 4-remove
        // System.out.println(arr.remove(1));

        // 5-update
        // arr.set(1,100);
        // System.out.println(arr);

        // 6-insert
        // arr.add(1,50);
        // System.out.println(arr);

        // 7-clear
        // arr.clear();
        // System.out.println(arr);

    //    create a function to find the maximum sum subarray of size k [30,30,30,10,20,10,1,40,40]: k=2

    int [] arr={30,30,30,10,20,10,1,40,40};
    nums=findSubArray(null, 0)

        






        
    }
    
}
