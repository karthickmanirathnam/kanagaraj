import java.io.*;
import java.util.*;
class EvenOdd
{
 public static void main(String args[])
 {
   Scanner a=new Scanner(System.in);
   int s=a.nextInt();
   if(s%2==0)
   {
     System.out.println("even");
   }
   else if(s%2!=0)
   {
     System.out.println("odd");
   }
  }
 } 
