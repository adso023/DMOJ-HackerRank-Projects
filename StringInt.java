import java.io.*;
import java.util.*;

public class StringInt {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();

    int aPlusB = A.length() + B.length();
    String lexAB = (A.compareTo(B) > 0) ? "Yes" : "No";
    String together = ((A.substring(0,1).toUpperCase()) + (A.substring(1))) + " " + ((B.substring(0,1).toUpperCase()) + (B.substring(1)));

    System.out.println(aPlusB);
    System.out.println(lexAB);
    System.out.println(together);
  }
}
