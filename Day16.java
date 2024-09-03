public class Day16 {
    // public static int fact(int n){
    //     if(n==0||n==1){
    //         return 1;
    //     }
    //     int x=n*fact(n-1);
    //     return x;
    // }

    // public static int power(int a,int b){
    //     if(a==0){
    //         return 1;
    //     }
    //     int x=b*power(a-1,b);
    //     return x;
    // }
    public static int facttail(int n,int x){
        if(n==0||n==1)
        return x;
        return facttail(n-1,(n)*x);
    }
    public static void main(String[] args) {
        // System.out.println(fact(31));
        // System.out.println(power(3, 2));
        System.out.println(facttail(4, 1));
        
      
        
    }
    
}
