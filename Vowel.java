import java.io.*;
import java.util.*;
class Vowel
{
  public static void main(String args[])
  {
   char c;
   Scanner s=new Scanner(System.in);
   c=s.next().charAt(0);
   if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
   {
     System.out.println("Vowel");
   }
   else
   {
     System.out.println("Consonant");
   }
  }
 } 
