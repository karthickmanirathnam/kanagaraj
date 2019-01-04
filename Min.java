import java.io.*;
import java.util.*:
class Min
{
 public static void main(String args[])
 {
   int i,min,n;
   int a[]=new int[];
   Scanner s=new Scanner(systrm.in);
   System.out.println("enter n:");
   n=s.nextInt();
   for(i=0;i<n;i++)
   {
      a[i]=s.nextInt();
   }
   for(i=0;i<n;i++)
   {
      System.out.println(a[i]);
   }
   min=a[0];
   for(i=0;i<n;i++)
   {
     if(a[i]<min)
     {
       min=a[i];
      }
    }  
      System.out.println(min);
    }
   } 
