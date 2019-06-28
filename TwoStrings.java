import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Enumeration;

public class TwoStrings {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int numWords = Integer.parseInt(br.readLine());

    for(int i = 0; i < numWords; i++){
      String s1 = br.readLine();
      String s2 = br.readLine();

      String res = twoStrings(s1, s2);

      System.out.println(res);
      System.out.println();
    }
  }

  static String twoStrings(String s1, String s2){
    Hashtable<Character, Integer> s = new Hashtable<Character, Integer>();
    Hashtable<Character, Integer> t = new Hashtable<Character, Integer>();

    for(int i = 0; i < s1.length(); i++){
      if(s.containsKey(s1.charAt(i))){
        s.replace(s1.charAt(i), s.get(s1.charAt(i)) + 1);
      }else{
        s.put(s1.charAt(i), 1);
      }
    }

    for(int i = 0; i < s2.length(); i++){
      if(t.containsKey(s2.charAt(i))){
        t.replace(s2.charAt(i), t.get(s2.charAt(i)) + 1);
      }else{
        t.put(s2.charAt(i), 1);
      }
    }

    int occur = 0;
    Enumeration<Character> keys = t.keys();

    while(keys.hasMoreElements()){
      char k = keys.nextElement();
      if(s.containsKey(k)){
        occur++;
      }
    }

    if(occur >= 1){
      return "YES";
    }else{
      return "NO";
    }

  }
}
