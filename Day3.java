public class Day3 {
    // static void swap(int a, int b ){
    //     int x=a;
    //     a=b;
    //     b=x;
    //     System.out.println(a);
    //     System.out.println(b);

    // }

    // static void numbers(int n){
    //     for(int i=1;i<=n;i++){
    //         System.out.println(i);
    //     }


    // }
    // static void checkprime(int n){
    //     for(int i=2;i<n;i++){
    //         if(n%i==0){
    //             System.out.println("no ");

    //         }
    //         else{
               

    //         }
    //     }
    //     System.out.println("yes");
    // }

    // static void reverse(int n){
    //     int temp=0;
    //     while(n!=0){
    //         temp=temp*10+ n%10;
    //         n=n/10;
    //     }
    //     reverse temp;



    //     }
    // static void digits(int n){
    //     int count =1;
    //     while(n>=10){
    //         int t =n%10;
    //         n=n/10;
    //         count++;


    //     }
    //     System.out.println(count);
    // }
    
    // static void armstrong(int n){
    //     while(n>=10){
    //     }
        

    // }
    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();

    }
   


    public static void main(String args []){
        // checkprime(6);
        // numbers(15);
        // swap(6, 04);
        // digits(4568);
        int [] arr = new int [10];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        printArr(arr);

       


    }
}

