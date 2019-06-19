import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mocking{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int numLines = Integer.parseInt(br.readLine());

    String[] container = new String[numLines];

    for(int i = 0; i < numLines; i++){
      container[i] = br.readLine();
    }

    System.out.println();
    String[] switched = switcher(container);

    for(int i = 0; i < switched.length; i++){
      System.out.println(switched[i]);
    }
  }

  static String[] switcher(String[] arr){
    String[] temp = new String[arr.length];
    for(int i = 0; i < arr.length; i++){
      temp[i] = switchLine(arr[i]);
    }
    return temp;
  }

  static String switchLine(String line){
    String regex = " !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
    String temp = ""; boolean switchCase = false;
    for(int i = 0; i < line.length(); i++){
      if(! regex.contains(String.valueOf(line.charAt(i))) && ! Character.isDigit(line.charAt(i))){
        temp += (! switchCase) ? Character.toLowerCase(line.charAt(i)) : Character.toUpperCase(line.charAt(i));
        switchCase = ! switchCase;
      }else{
        temp += line.charAt(i);
      }
    }

    return temp;
  }
}
