import java.io.*;
import java.util.*;
class sample{

 public static void main(String []args)
  {

    System.out.println("enter a number for ? ");
    Scanner scr=new Scanner(System.in);
    int no=scr.nextInt();
    int r, s=0;
    while( no> 0)  //  4321   432  43 4
    {
     
       r = no % 10; 
       s = s+r; //    s=1   12   123  1234

        if( no>9)
        {
           s=s*10; //  10     120   1230   
        }

       no=no/10; //   432    43 4
   
    }

    System.out.println(" result"+s);
}

}