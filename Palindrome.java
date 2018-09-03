import java.io.*;
import java.util.*;
class Palindrome
{
  public static void main(String args[])
  {
    int n,ri=0,oi,r;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    oi=n;
    while(n!=0)
    {
       r=n%10;
       ri=ri*10+r;
       n/=10;
     }
    if(oi==ri)
    {
      System.out.println("yes");
    }
    else
    { 
      System.out.println("not");
     }
    }
  }  
     
