import java.io.*;
import java.util.*;
public class SumArithmetic {
public static void main(String[] arg)
    {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter first term, common difference and n (number of terms)");
    int a=scan.nextInt(),d=scan.nextInt(),n=scan.nextInt();
    System.out.print("Sum: "+n*(2*a+(n-1)*d)/2);
    }
}
