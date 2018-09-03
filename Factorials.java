import java.io.*;
import java.util.*;
class Factorials
{
  public static void main(String args[])
  {
    int i,facto=1;
    Scanner sc= new Scanner (System.in);
    int a=sc.nextInt();
    for(i=1;i<=a;i++)
    {
      facto=facto*i;
     }
     System.out.println(facto);
   }
 }  
