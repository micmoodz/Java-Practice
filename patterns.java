// import java.util.*;
// public class patterns {
//     public static void main(String[] args) {
        //solid rectangle
        //outer loop for rows
        // for (int i=1;i<=4;i++){
        //     //inner loop for columns
        //     for (int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //hollow rectangle
        // int m=4;
        // int n=5;
        // for(int i=1;i<=m;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i==1 || j==1 ||i==m ||j==n){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println( );
        // }
        //half pyramid
        // int m=4;
        // for (int i=1; i<=m; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //inverted half pyramid
        //int m=4;
        // for(int i=m; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //inverted half pyramid (rotated 180 degrees)
        // int m=4;
        // for(int i=1; i<=m;i++){
        //     for(int j=1; j<=m-i;j++){
        //         System.out.print(" ");
        //     }
        //     for (int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //half pyramid with numbers
        // int m=5;
        // for(int i=1; i<=m; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        //inverted half pyramid with numbers
        // int m=5;
        // for(int i=m; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        //code 2
        // int m=5;
        // for(int i=1; i<=m; i++){
        //     for(int j=1; j<=m-i+1; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        //floyd's triangle
        // int m=5;
        // int number=1;
        // for(int i=1; i<=m;i++){
        //     for(int j=1; j<=i;j++){
        //         System.out.print(number+" ");;
        //         number++; //no.=no.+1
        //     }
        //     System.out.println();
        // }
        //0-1 triangle
        // int m=5;
        // for(int i=1; i<=m; i++){
        //     for(int j=1; j<=i; j++){
        //         int sum=i+j;
        //         if(sum%2==0){
        //             System.out.print("1 ");
        //         }
        //         else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }
        //butterfly pattern
        // int m=5;
        // //upper half
        // for(int i=1; i<=m; i++){
        //     //1st part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     //spaces
        //     int spaces=2*(m-i);
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" ");
        //     }
        //     //2nd part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // //lower half
        // for(int i=m; i>=1; i--){
        //     //1st part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     //spaces
        //     int spaces=2*(m-i);
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" ");
        //     }
        //     //2nd part
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //solid rhombus
        // int m=5;
        // for(int i=1; i<=m; i++){
        //     for(int j=1; j<=m-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=5; j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }
        //no. pyramid
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
        //palindromic pattern
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i; j>=1; j--){
        //         System.out.print(j);
        //     }
        //     for(int j=2; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        //diamond pattern
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    //}
//}