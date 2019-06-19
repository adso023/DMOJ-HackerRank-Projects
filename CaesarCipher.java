import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CaesarCipher {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int charCount = Integer.parseInt(br.readLine());
    String unencryptedText = br.readLine();
    int keyShift = Integer.parseInt(br.readLine());
    String encryptedText = caesarCipher(unencryptedText, keyShift);
    System.out.println(encryptedText);
  }

  static String caesarCipher(String s, int k){

    String toReturn = "";

    for(int i = 0; i < s.length(); i++){
      if(Character.isLetter(s.charAt(i))){
        if(Character.isUpperCase(s.charAt(i))){
          toReturn += (char)(((int)s.charAt(i) + k - 65) % 26 + 65);
        }else{
          toReturn += (char)(((int)s.charAt(i) + k - 97) % 26 + 97);
        }
      }else{
        toReturn += s.charAt(i);
      }
    }
    return toReturn;
  }

}
