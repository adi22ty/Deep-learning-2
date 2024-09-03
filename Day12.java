public class Day12 {
    // public static void String (String s1){
    //     for(int i=s1.length()-1;i>=0;i--){
    //         System.out.print(s1.charAt(i));

    //     }


    // }
    // another method to reverse a string

    public static void reverse(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);

        }
        System.out.println(rev);
    }

    // public static boolean palindrome (String s){
    //     int i=0,j=s.length()-1;
    //     while(i<=j){
    //         if(s.charAt(i)!=s.charAt(j))
    //         return false;
    //         i++;j--;
    //     }
    //     return true;
      
    // }

    // public static char maxoccur(String s){
    //     int countmaxelement=0;
    //     char maxelement='*';
    //     int countcurrelement=0;
    //     char currelement='*';
    //     for(int i=0;i<s.length();i++){
    //         if(s.charAt(i)!=currelement){
    //             if(countcurrelement>countmaxelement){
    //                 countmaxelement=countcurrelement;
    //                 maxelement=currelement;
    //             }
    //             currelement=s.charAt(i);
    //             countcurrelement=1;

    //         }else{
    //             countcurrelement++;
    //         }
    //     }
    //     if(countcurrelement>countmaxelement){
    //         countmaxelement=countcurrelement;
    //         maxelement=currelement;
    //     }
    //     return maxelement;


    // public static char maxoccur2(String s){
    //     int [] arr=new int [26];
    //     for(int i=0;i<s.length();i++){
    //         arr[s.charAt(i)-'a']++;
    //     }
    //     int index=0;
    //     int maxoccur=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[index]<arr[i]){
    //             index=i;
    //         }

    //     }
    //     return (char)('a'+index);

    // }

    // public static void reversewords(String s){
    //     String [] arr= s.split("\\s");
    //     for(int i=arr.length-1;i>=0;i--){
    //         System.out.print(arr[i]+" ");
    //     }
    // } 



    

    public static void main(String[] args) {

    // String s1="Girls\b Rule";
    // String s2="This is \rhey";
    // String s3="this \tis \ta \tclass";
    // String s4="girls rule \f";

        // System.out.println(s4);

        // split function
        // String s1="hi,this is an example string";
        // String [] arr=s1.split("\\s");
        // for(String i:arr )
        // System.out.println(i);

        // function to reverse a string
        // function to check if a string is palindrome or not
        // find the maximum occuring element in a sorted string eg-aaabbbbcdd =>b
        // find the maximum occuring2 element in a string eg-aababcdadbca =>a
        // function to reverse the words of a string . 

        // String s="A man a plan a canal Panama";
        // // // String(s);
        // System.out.println(palindrome(s));

        // String s="aaabbbbcdd";
        // System.out.println(maxoccur(s));

        // String s="aababcdadbca";
        // System.out.println(maxoccur2(s));

        // String s="i am batman";
        // reversewords(s);

        String s="aditya";
        reverse(s);
        

       


        
        
    }
    
}
