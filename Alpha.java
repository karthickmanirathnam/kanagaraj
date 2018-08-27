import java.io.*;
import java.util.*;
class Alpha
{ 
   public static void main(String args[])
   {
     char k;
     Scanner s=new Scanner(System.in);
     k=s.next().charAt(0);
     if(k>='a'&& k>='A')
     {
       System.out.println("Alphabets");
     }
     else
     {
       System.out.println("Numeric values");
     }
    }
    }
      
