import java.io.*;
import java.util.*;
class Arrays
{
  public static void main(String args[])
  {
    int i,n,sum=0,k;
    int a[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n values");
    n=sc.nextInt();
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("enter k values");
    k=sc.nextInt();
    for(i=0;i<=k;i++)
    {
     sum=sum+a[i];
    }
    System.out.println(sum);
   }
  } 
