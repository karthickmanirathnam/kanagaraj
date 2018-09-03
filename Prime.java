import java.io.*;
import java.util.*;
class Prime
{
  public static void main(String args[])
  {
    int i,n;
    boolean flag=false;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for(i=2;i<=n/2;++i)
    {
      if(n%i==0)
      {
        flag=true;
        break;
       }
      }
     if(!flag)
     {
       System.out.println("yes");
      }
      else
      {
        System.out.println("no");
      }
    }
  }  
