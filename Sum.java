import java.io.*;
import java.util.*;
class Sum
{
  public static void main(String args[])
  {
    int sum=0;
    int i,n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for(i=1;i<=n;i++)
    {
      sum=sum+i;
     }
     System.out.println(sum);
   }
  } 
