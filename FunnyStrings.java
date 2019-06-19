import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class FunnyStrings{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());

    for(int i = 0; i < num; i++){
      String s = br.readLine();
      String result = funnyString(s);
      System.out.println(result);
    }
  }

  static String funnyString(String s){
    int n = s.length();

    int[] sCharInt = new int[n];
    int[] rCharInt = new int[n];


    for(int i = 0; i < n; i++){
      sCharInt[i] = (int)s.charAt(i);
      rCharInt[i] = (int)s.charAt(n - i - 1);
      System.out.println(sCharInt[i] + " " + rCharInt[i]);
    }

    System.out.println();

    int[] sAdjDiff = new int[n - 1]; int[] rAdjDiff = new int[n - 1];

    for(int i = 0; i < (n - 1); i++){
      sAdjDiff[i] = (sCharInt[i+1] > sCharInt[i]) ? (sCharInt[i+1] - sCharInt[i]) : (sCharInt[i] - sCharInt[i+1]);
      rAdjDiff[i] = (rCharInt[i+1] > rCharInt[i]) ? (rCharInt[i+1] - rCharInt[i]) : (rCharInt[i] - rCharInt[i+1]);

      System.out.println(sAdjDiff[i] + " " + rAdjDiff[i]);

      if(sAdjDiff[i] != rAdjDiff[i]){
        return "Not Funny";
      }
    }

    return "Funny";
  }
}
