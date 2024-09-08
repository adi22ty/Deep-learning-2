public class Day17 {
//     public static int fib(int n){
//         if(n==1){
//         return 0;
//     }
//     if(n==2){
//         return 1;
//     }
//     int fibsum=fib(n-1)+fib(n-2);
//     return fibsum;
// }

// public static void generatesubsequence(String ques,String ans){
//     if(ques.length()==0){
//         System.out.println(ans);
//         return;
//     }
//     generatesubsequence(ques.substring(1), ans+ques.charAt(0));
//     generatesubsequence(ques.substring(1), ans);

// public static void cointoss(int n,String p){
//     if(n==0){
//         System.out.println(p);
//         return;
//     }
//     cointoss(n-1, p+"H");
//     cointoss(n-1, p+"T");

// }

// public static int countcointoss(int n){
//     if(n==0){
//         return n;
    
//     }
//     if(n==1){
//         return 2;
//     }
//     int l=countcointoss(n-1);
//     int r=countcointoss(n-1);
//     return l+r;
   

// }
// public static int countsubsequence(String ques){
//     if(ques.length()==0){
//         return 1;
//     }
//     int l=countsubsequence(ques.substring(1));
//     int r=countsubsequence(ques.substring(1));
//     return l+r;
    
// }

// public static void generateparenthesis(int n,String ans,int l,int r){
//     if(l==n &&r==n){
//         System.out.println(ans);
//         return;
//     }
//     if(l<n){
//         generateparenthesis(n, ans+"{", l+1, r);
//     }
//     if(r<l){
//         generateparenthesis(n, ans+"}", l, r+1);
//     }
// }

public static void permutation(String ques,String ans){
    if(ques.length()==0){
        System.out.println(ans);
        return;
    }
    for(int i=0;i<ques.length();i++){
        String s1=ques.substring(0, i);
        String s2=ques.substring(i+1);
        permutation(s1+s2, ans+ques.charAt(i));
    }
}


    
 
    public static void main(String[] args) {
        // System.out.println(fib(8));
        // generatesubsequence("car", "");
        //System.out.println(countcointoss(0));
        // System.out.println(countsubsequence("car"));
        // generateparenthesis(3, "", 0, 0);
        permutation("abc", "");
        
        
        
       
        
       
        
        
    }
    
}
