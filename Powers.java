import java.io.*;
import java.util.*;
class Powers
{
  public static void main(String args[])
  {
    int n,p,r=1,i;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    p=s.nextInt();
    if(n>=0 && p==0)
    {
      r=1;
    }
    else if(n==0 && p>=1)
    {
      r=0;
    }
    else
    {
      for(i=1;i<=p;i++)
      {
        r=r*n;
       }
     }
    System.out.println(n+"^"+p+"="+r);
   }
  } 
