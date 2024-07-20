public class Assignment {
    public static void main(String[] args) {
        // Question 1
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        // }

        // Question2
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");

        //     }
        //     System.out.println("");
        // }

    //  Question 3
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j =5; j >= i; j--) {
        //         System.out.print("* ");
        //     }
        //     System.out.println(" "); 
        // }

        // Question 4
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=5-i;k++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Question 5
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int k=5;k>=i;k--){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }

        // Question6
//         int n=4;
// for(int i=n;i>=1;i--){
//     for(int k=1;k<=4-i;k++){
//         System.out.print("    ");

//     }
//     for(int j=1; j<=i;j++){
//         System.out.print("* ");
//     }
//     System.out.println();
   


//     }

// Question 7
// int n=5;
// for(int i=1;i<=5;i++){
//     for(int j=1; j<=n; j++){
//         if(i==5 || i==1 || j==1 || j==5){
//             System.out.print("* ");
//         }
//         else{
//             System.out.print("  ");
//         }
        

// }
// System.out.println();
//     }

// Question9
// int n=5;
// for(int i=1;i<=5;i++){
//     for(int j=1;j<=5-i;j++){
//         System.out.print(" ");
//     }
//     for(int k=1;k<=i*2-1;k++){
//         System.out.print("*");
//     }
//     System.out.println();
    
// }

// Question10
// int n=5;
// for(int i=5;i>=1;i--){
//     for(int j=1;j<=5-i;j++){
//         System.out.print(" ");
//     }
//     for(int k=1;k<i*2-1;k++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// Question 11
// int n=5;
// for(int i=1; i<=n;i++){
//     for(int j=1; j<=5-i;j++){
//         System.out.print(" ");
//         }
//         for(int k=1; k<=i*1;k++){
//             System.out.print("* ");
//         }
//         System.out.println();
//     }

// Question 12
// int n=5;
// for(int i=1; i<=n; i++){
//     for(int j=2;j<=5-i;j++){
//         System.out.println("! ");
//     }
//     for(int k=1;k<=i*1;k++){
//         System.out.print("* ");
//     }
//     System.out.println();
// }

// Question 13
// int n=5;
// for (int i = 1; i <= n; i++) {
//     for (int j = 1; j <= i; j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }

// for (int i = n - 1; i >= 1; i--) {
//     for (int j = 1; j <= i; j++) {
//         System.out.print("* ");
//     }
//     System.out.println();


// }
// Question14
// int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=5-i;j++){
//         System.out.print(" ");
//     }
//     for(int k=1;k<=i;k++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// for(int i=n-1;i>=1;i--){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int k=1;k<=i;k++){
//         System.out.print("*");
//     }
//     System.out.println();

// Question23
// int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=5-i;j++){
//         System.out.print(" ");
//     }
//     for(int k=1; k<=i*2-1;k++){
//         System.err.print("1 ");
//     }
//     System.out.println();
// }

// Question25
// int n=5;
// int num=1;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=5-i;j++){
//         System.out.print(" ");
//     }
//     for(int k=1;k<=2*i-1;k++){
//         System.out.print((String.format("%2d",num++ )));
//          System.out.print(" ");

//     }
//     System.out.println();
// }

// Question26
// int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=5-i;j++){
//         System.out.print(" ");
//     }
//     for(int k=1;k<=2*i-1;k++){
//         System.out.print(k+"");
//     }
//     System.out.println();
// }

// Question27
// int n = 5;

// for (int i = 1; i <= n; i++) {
//     // Print ascending part
//     for (int j = 1; j <= i; j++) {
//         System.out.print(j + " ");
//     }
//     // Print descending part
//     for (int j = i - 1; j >= 1; j--) {
//         System.out.print(j + " ");
//     }
//     System.out.println();
// }



// // Question28
// int n=5;
// for (int i = 1; i <= n; i++) {
//     int num = i;
    
//     // Loop for increasing numbers
//     for (int j = 1; j <= i; j++) {
//         System.out.print(num + " ");
//         num++;
//     }
    
//     num -= 2;
    
//     // Loop for decreasing numbers
//     for (int j = 1; j < i; j++) {
//         System.out.print(num + " ");
//         num--;
//     }
    
//     // Move to the next line
//     System.out.println();
// }


// Question30
// int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=5;j>=1;j--){
//         System.out.print(j+"");
//     }
//     System.out.println();
// }

// Question 31
int n=5;
for(int i=1;i<=n;i++){
    for(int j =5;j>=1;j--){
    if(i+ j == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        









}
}
}


 










   













  


    
    
    

