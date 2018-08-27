import jav.io.*;
import java.util.*;
class Digits
{
   public static void main(String args[])
   {
     int c=0;
     Scanner s=new Scanner(System.in);
     int a=s.nextInt();
     while(a!=0)
     {
       a=a/10;
       c=c+1;
      }
     System.out.println(c);
    }
   } 
