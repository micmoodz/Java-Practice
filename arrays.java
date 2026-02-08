import java.util.*;
public class arrays {
    public static void main (String[] args){
        //method 1
        int[] marks= new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=95;
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        } 
        //method 2
        int [] marks={97,95,98};
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
        //takes an array as input from the user , search for a given number x and print the index at which it occurs
        Scanner sc= new Scanner (System.in);
        int size = sc .nextInt();
        int numbers[]  = new int [size];
        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (int i=0; i<numbers.length; i++){
            if(numbers[i]==x){
                System.out.println("x found at index:" + i);
            }
        }
        //2D array
        Scanner sc= new Scanner(System.in);
        int rows= sc.nextInt();
        int columns= sc.nextInt();
        int numbers[][]= new int [rows][columns];
        for(int i=0; i<rows; i++){
            for(int j= 0; j<columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        int x= sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j= 0; j<columns; j++){
                if(numbers[i][j]==x){
                    System.out.println("x found at locations("+ i + "," + j +")");
                }   
            }
        }
    }
}