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
    // public static boolean armstrong(int n){
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
        // public static void printArmstrong(int n1,int n2){
        //     for(int i=n1; i<n2;i++){
        //         if(armstrong(i)){
        //             System.out.println(i);
        //         }
        //     }
        // }

        // Conversion (Fahrenheit to Celsius)
        // public static void conversion(int min,int max,int step){
        //     for(int i=min;i<=max;i+=step){
        //         int y=(int)((5.0/9)*(i -32));
        //         System.out.println(i+""+y);
        //     }
           
        // }

        // binary to decimal
        // public static int binary(int n){
        //     int placevalue=1;
        //     int r;
        //     int ans =0;
        //     while(n>0){
        //         r=n%10;
        //         n=n/10;
        //         ans=ans+placevalue*r;
        //         placevalue=2*placevalue;

        //     }
        //     return ans;

        // }

        // Count digits
        // public static int countdigits(int n,int d){
        //     int count=0;
        //     while(n>0){
        //         if(n%10==d)
        //             count++;
        //             n=n/10;
        //         }
        //     return count;

        // }

        // print series
        // public static void PrintSeries(int n1,int n2){
        //     int count=0;
        //     int n=1;
        //     while(count<n1){
        //         int term=3*n+2;
        //         if(term%n2!=0){
        //             System.out.println(term);
        //             count++;
        //         }
        //         n++;
        //     }
           
            

        // }

        // boston number 
    //    public static int sumofdigits(int n){
    //     int r,sum=0;
    //     while(n>0){
    //         r=n%10;
    //         sum=sum+r;
    //         n=n/10;


    //     }
    //     return sum;
    //    }
    //    public static int factorsum(int n){
    //     int sum=0;
    //     while(n%2==0){
    //         sum =sum+sumofdigits(2);
    //         n=n/2;
    //         for (int i = 3; i <= n; i += 2) {
    //             while (n % i == 0) {
    //                 sum =sum+ sumofdigits(i);
    //                 n = n/i;
    //             }
    //         }
    //         if (n > 2) {
    //             sum = sum+sumofdigits(n);
    //         }
            


            

            
    //     }
    //     return sum;
       
    //    }

    // odd even rule
    // public static int sumofeven(int n){
    //     int r,sum=0;
    //     while(n>0){
    //         r=n%10;
    //         if(r%2==0){
    //             sum=sum+r;
    //         }
    //         n=n/10;


    //     }
    //     return sum;
    // }

    // public static int sumofodd(int n){
    //     int r,sum=0;
    //     while(n>0){
    //         r=n%10;
    //         if(r%2!=0){
    //             sum=sum+r;

    //         }
    //         n=n/10;

    //     }
    //     return sum;

    // }
    // public static boolean canCarRunOnSunday(int carNumber) {
    //     int sumEven = sumofeven(carNumber);
    //     int sumOdd = sumofodd(carNumber);
    //     return (sumEven % 4 == 0) || (sumOdd % 3 == 0);
    // }

   

    
    



        


        
        
       

        
       
        
        


        


    
    
      
        public static void main(String[] args) {
            
           
            
            
        




        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the number of cars: ");
        // int N = sc.nextInt();
        // for (int i = 0; i < N; i++) {
        //     System.out.print("Enter car number " + (i + 1) + ": ");
        //     int carNumber = sc.nextInt();
        //     if (canCarRunOnSunday(carNumber)) {
        //         System.out.println("Yes");
        //     } else {
        //         System.out.println("No");
        //     }
        // }
        

















        // Scanner sc=new Scanner (System.in);
        // System.out.println("enter the number");
        // int n=sc.nextInt();
        // int sumofdigits = sumofdigits(n);
        // int factorsum = factorsum(n);
        // if (sumofdigits == factorsum) {
        //     System.out.println(1); // The number is a Boston number
        // } else {
        //     System.out.println(0); // The number is not a Boston number
        // }

        










        // Scanner sc=new Scanner (System.in);
        // int n1=sc.nextInt();
        // int n2=sc.nextInt();
        // PrintSeries(n1,n2);
    





        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();

        







        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int d=sc.nextInt();
        // System.out.println(countdigits(n,d));







        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int decimal=binary(n);
        // System.out.println(decimal);
        
        
        


        // Scanner sc=new Scanner(System.in);
        // int min=sc.nextInt();
        // int max=sc.nextInt();
        // int step=sc.nextInt();
        // conversion(min,max,step);

        // int placevalue=1;
        // int n=101010;
        // int ans =0;
        // while (n>0) {
        //     int r=n%10;
        //     n=n/10;
        //     ans=ans+placevalue*r;
        //     placevalue=2*placevalue;
        //  }
        //  System.out.println(ans);
      






        // int n1,n2;
        // Scanner sc=new Scanner(System.in);
        // n1=sc.nextInt();
        // n2=sc.nextInt();
        // printArmstrong(n1,n2);
        




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

        // sum of odd placed and even placed digits
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();

        
        // int sumodd=0;
        // int sumeven=0;
        // while(n>0){
        //     int temp=n;
        //     temp=temp%10;
        //     if(temp%2!=0){
        //         sumodd=sumodd+temp;
        //     }else{
        //         sumeven=sumeven+temp;
        //     }
        //     n=n/10;


            
        // }
        // System.out.println(sumodd);
        // System.out.println(sumeven);


      


       



        


        

        
        

        

        



        

    
       
       
        

       
       
        
      








    }
    
}
