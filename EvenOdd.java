import java.io.*;
import java.util.*;
class Positive
{
 public static void main(String args[])
 {
   Scanner a=new Scanner(System.in);
   int b=a.nextInt();
   if(b>0)
   {
     System.out.println("positive");
   }
   elseif(b==0)
   {
     System.out.println("zero");
   }
  else
  {
    System.out.println("negative");
  }
  }
 } 
