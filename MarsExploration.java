import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MarsExploration{

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String sosString = br.readLine();

    System.out.println(corruptedSignals(sosString));
  }

  static int corruptedSignals(String s){
    int signalsCorrupted = 0;
    String collection = "";
    String checkAgainst = "SOS";

    for(int i = 1; i <= s.length(); i++){
      collection += String.valueOf(s.charAt(i - 1));

      if(i % 3 == 0){
        System.out.print("Signal: " + collection);

        if(! collection.equals(checkAgainst)){
          System.out.print(" -> corrupted ");

          for(int j = 0; j < 3; j++){
            if(! String.valueOf(collection.charAt(j)).equals(String.valueOf(checkAgainst.charAt(j)))){
              signalsCorrupted++;
              System.out.print(String.valueOf(collection.charAt(j)) + " ");
            }
          }

        }

        System.out.println();
        collection = "";
      }

    }

    return signalsCorrupted;
  }
}
