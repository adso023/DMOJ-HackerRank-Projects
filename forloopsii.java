import java.util.*;
import java.io.*;

class forloopsii {

  public static void main(String[] argh){
    Scanner in  = new Scanner(System.in);

    int t = in.nextInt();
    for(int i = 0; i < t; i++){
      int a = in.nextInt();
      int b = in.nextInt();
      int n = in.nextInt();

      int sum = 0;
      for(int j = 0; j < n; j++){
        if(j == 0) sum = a + (int)(Math.pow(2, j)) * b;
        else sum += (Math.pow(2, j)) * b;

        if(j < n - 1) System.out.print(sum + " ");
        else System.out.println(sum);
      }
    }
  }
}
