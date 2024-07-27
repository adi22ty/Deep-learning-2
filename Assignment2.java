import java.util.Scanner;
public class Assignment2 {
    //  public static void lcm (int a,int b){
    //     int g=0;
    //     Scanner sc=new Scanner(System.in);
    //     for(int i=1;i<=a;i++){
    //         if(a%i==0&&b%i==0)
    //         g=i;
    //     }
    //      int lcm=a*b/g;
    //     System.out.println("enter the a");
    //     a=sc.nextInt();
    //     System.out.println("enter the b");
    //     b=sc.nextInt();
    //     System.out.println("lcm of a and b is "+lcm);
    


    // }
    // to find lcm using return statement 
    // public static int LCM(int a, int b){
    //     int g=0;
    //     int lcm=0;
    //     for(int i=1;i<=a;i++){
    //         if(a%i==0&&b%i==0){
    //             g=i;
    //         }
    //         lcm=a*b/g;
          
    //     }
    //     return lcm;
    // }

    // to find prime using function
    // public static void prime(int n){
    //     for(int i=2;i<=n;i++){
    //         if(n%i==0){
    //             System.out.println("not prime number");
    //             break;

    //         }
    //         else{
    //             System.out.println("prime number");
    //             break;
    //         }
    //     }

    // }

    // Is Armstrong Number
    // public boolean armstrong (int n){
    //     int c,r,arm=0;
    //     c=n;
    //     while(n>0){
    //         r=n%10;
    //         arm=(r*r*r)+arm;
    //         n=n/10;
    //     }
    //     if(c==arm){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }

    // }

    // Print Armstrong Numbers
    public static boolean armstrong(int n){
        int c,r,arm=0;
        c=n;
        while(n>0){
            r=n%10;
            arm=(r*r*r)+arm;
            n=n/10;

        }
        if(c==arm){
            return true;
        }
        else{
            return false;
        }
    }
        public static void printArmstrong(int n1,int n2){
            for(int i=n1; i<n2;i++){
                if(armstrong(i)){
                    System.out.println(i);
                }
            }
        }

        
        
       

        
       
        
        


        


    
    public static void main( String args []){
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        printArmstrong(n1,n2);
        




        // Scanner sc=new Scanner (System.in);
        // int n=sc.nextInt();
        // System.out.println(true);

        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // prime(n);

        // Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // System.out.println(LCM(a,b));

        // lcm(4,6);
        // Count Digits
        // int n=5674;
        // int count=0;
        // while(n>0){
        // n=n/10;
        // count++;
        // }
        // System.out.println(count);

        // Print reverse
        // int n=7654;
        // int r;
        // while(n>0){
        //     r=n%10;
        //     System.out.print(r);
        //     n=n/10;

        // }

        // Conversion (Fahrenheit to Celsius)
        // double f=42.2;
        // double c=0.0;
        // c=(f-32)/1.8;
        // System.out.println("temperature in celsius is"+c);

        // Is Armstrong Number
        // int n=370,r,c,arm=0;
        // c=n;
        // while(n>0){
        //     r=n%10;
        //     arm=(r*r*r)+arm;
        //     n=n/10;

        // }
        // if(c==arm){
        //     System.out.println("it is an armstrong number");
        // }
        // else{
        //     System.out.println("it is not armstrong number");
        // }

        // Check prime
        // int n=5;
        // int count=0;
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         count++;
        //     }
        // }
        // if(count==2){
        //     System.out.println("it is a prime number");
        // }
        // else{
        //     System.out.println("not prime number");
        // }

        // LCM of two numbers 
        // int a,b;
        // Scanner sc= new Scanner(System.in);
        // System.out.println("enter the value of a");
        // a=sc.nextInt();
        // System.out.println("enter the value of b");
        // b=sc.nextInt();
        // int g=0;
        // for(int i=1;i<=a;i++){
        //     if(a%i==0&&b%i==0)
        //     g=i;
        // }
        // int lcm=a*b/g;
        // System.out.println("lcm of a and b is "+lcm);

        // hcf of two numbers
        // int a,b;
        // int g=0;
        // Scanner sc =new Scanner (System.in);
        // System.out.println("enter the a ");
        // a=sc.nextInt();
        // System.out.println("enter the b");
        // b=sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     if(a%i==0&&b%i==0)
        //     g=i;
        // }
        // System.out.println("gcd of a and b is "+g);

        

        



        

    
       
       
        

       
       
        
      








    }
    
}
