import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class CamelCase{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String camelCase = br.readLine();

    System.out.println(countWords(camelCase));
  }

  public static int countWords(String str){
    ArrayList<Integer> indexes = indexFind(str);
    return indexes.size() + 1;
  }

  public static ArrayList<Integer> indexFind(String str){
    ArrayList<Integer> temp = new ArrayList<Integer>();
    int index = 0;
    for(int i = 0; i < str.length(); i++){
      if(Character.isUpperCase(str.charAt(i))){
        temp.add(i);
      }
    }

    return temp;
  }
}
