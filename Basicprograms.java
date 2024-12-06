import java.util.Scanner;
public class Basicprograms {

    //  public static int root(int x){
    //     double m=Math.sqrt(x);
    //     return(int) m;
    //  }


    // public double power(double x,int n){
    //     double m=Math.pow(x,n);
    //     return m;
    // }

    // public static boolean ispalindrome(int n){
    //     int r,c;
    //     int s=0;
    //     c=n;
    //     while(n>0){
    //         r=n%10;
    //         s=(s*10)+r;
    //         n=n/10;
    //     }
    //     if(c==s){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }

    
   
    public static void main (String args[]){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // System.out.print(ispalindrome(n));

        // Addition of Two Numbers:
        // int num1=5;
        // int num2=4;
        // int sum;
        // sum=num1+num2;
        // System.out.println("sum of num1+num2 is "+sum);

        // Addition of Two Numbers using user input
        // int num1;
        // int num2;
        // int sum;
        // Scanner sc =new Scanner(System.in);
        // System.out.println("enter the num1");
        // num1= sc.nextInt();
        // System.out.println("enter the num2");
        // num2=sc.nextInt();5

        // sum=num1+num2;
        // System.out.println("sum of two numbers is"+sum );

        // Check Even or Odd Number:
        // int n=6;
        // if(n%2==0){
        //     System.out.println("it is even number");

        // }
        // else{
        //     System.out.println("it is an odd number");
        // }
       

        // Factorial of a Number:
        // int n=5;
        // int fact=1;
        // for(int i=1;i<=n;i++){
        //     fact=fact*i;
        // }
        // System.out.println(fact);

        // pattern printing
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // reverse of a given number
        // int n=1024;
        // int r;
        // while(n>0){
        //     r=n%10;
        //     System.out.print(r);
        //     n=n/10;
        // }

        // prime numbers in java
        // int n=7;
        // for(int i=2;i<=n-1;i++){
        //     if(n%i==0){
        //         System.out.println("no");
        //     }
        //     else{
        //         System.out.println("yes");
        //     }
        // }

        // Armstrong number
        // int n=473;
        // int arm=0;
        // int r;
        // int c;
        // c=n;
        // while(n>0){
        //     r=n%10;
        //     arm=(r*r*r)+arm;
        //     n=n/10;
        // }
        // if(c==arm){
        // System.out.println("armstrong number");
        // }
        // else{
        // System.out.println("not armstrong number");
        // }

        // prime number
        // int n;
        // int count=0;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the n");
        // n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     if(n%i==0)
        //     {
        //         count++;
        //     }
        // }
        // if(count==2){
        //     System.out.print("prime number");
        // }
        // else{
        //     System.out.print("not prime number");
        // }

        // count the number of digits
        // int n=4567;
        // int count=0;
        // while(n>0){
        //     n=n/10;
        //     count++;
        // }
        //     System.out.print(count);

        // fahrehnit ti celsius
        // double f=45.5;
        // double c=0.0;
        // c=(f-32)/1.8;
        // System.out.println("value of temperature in celsius"+c);

        // reverse by user input
        // Scanner sc=new Scanner(System.in);
        // int n;
        // int r;
        // System.out.println("enter the n");
        // n=sc.nextInt();
        // while(n>0){
        //     r=n%10;
        //     System.out.print(r);
        //     n=n/10;
        // }

        // Fibonnaci series by user input
        // int a=0,b=1,c,term;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the term");
        // term=sc.nextInt();
        // for(int i=1;i<=term;i++){
        //     System.out.print(""+a);
        //     c=a+b;
        //     a=b;
        //     b=c;

        // }

        // sum of digits in number
        // Scanner sc=new Scanner (System.in);
        // int n=sc.nextInt();
        // int r,sum=0;
        // while(n>0){
        //     r=n%10;
        //     sum=sum+r;
        //     n=n/10;
        // }
        // System.out.println(sum);


        // square root of a number
        // Scanner sc=new Scanner (System.in);
        // System.out.println(root(x));
        // int x=sc.nextInt();
        


        // Scanner sc=new Scanner(System.in);
        // int x=sc.nextInt();
        // int n=sc.nextInt();
        // System.out.println(power(x,n));

        // palindrome number
        int n=121,r,c,s=0;
         c=n;
         while(n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
         }
         if(c==s){
            System.out.print("palindrome number");
         }
         else{
            System.out.print("not palindrome number");
         }

        // Swapping of two numbers without using third variable
        // int a=4;
        // int b=3;
        // a=a-b;
        // b=a+b;
        // a=b-a;

        // using bitwise operator 
        // a=a^b;
        // b=a^b;
        // a=a^b;
        // System.out.println("the value of a after swapping"+a);
        // System.out.println("the value of b after swapping"+b);


     
    }
}
        

        




            

        



        
    
    

