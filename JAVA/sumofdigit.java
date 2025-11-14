import java.io.*;
import java.util.Scanner;
public class sumofdigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number :");
        int n=sc.nextInt();  //4321
      
        int result=0;
    
        while(n>0){
            result+=n%10;  
            n/=10;
        }
        System.out.println(result);
    }
} 