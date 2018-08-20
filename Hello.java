import java.io.*;
import java.util.*;
class Hello
{
  public static void main(String args[])
  {
    System.out.println("Enter the number:");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(int i=0;i<n;i++)
    {
      System.out.println("Hello");
    }
  }
 } 
