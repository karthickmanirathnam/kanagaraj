import java.io.*;
import java.util.*;
class Primeno
{
  public static void main(String args[])
  {
    int l,h;
    Scanner sc=new Scanner(System.in);
    l=sc.nextInt();
    h=sc.nextInt();
    while(l<h)
    {
      boolean flag=false;
      for(int i=2;i<=l/2;i++)
      {
        if(l%i==0)
        {
          flag=true;
          break;
        }
      }
    if(!flag)
    {
     
        System.out.println(l+" ");
        l++;
    }
  }
 }
} 
 
