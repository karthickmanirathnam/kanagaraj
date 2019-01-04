import java.io.*;
import java.util.*;
class Max
{ 
  public static void main(String args[])
  {
  int n,max;
   int a[]=new int[];
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt(); //no.of elements
   for(int i=0;i<n;i++) //to get user input
   {
      a[i]=sc.nextInt();
   }
    for(int i=0;i<n;i++)// display user input
    {
       System.out.println(a[i]);
    }
    max=a[0];
    for(int i=0;i<n;i++)
      {
        if(a[i]>max)
        {
          max=a[i];
         }
      }
    System.out.println(max);
    }
  }  
      
        
    
  
 
