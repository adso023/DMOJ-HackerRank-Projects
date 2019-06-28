import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class Left_Rotation{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");

    int capacity = Integer.parseInt(in[0]);
    int numRotations = Integer.parseInt(in[1]);

    String[] inNums = br.readLine().split(" ");

    String[] rotated = rotate(inNums, numRotations);

    for (int i = 0; i < capacity; i++) {
      if(i == capacity-1){
        System.out.println(rotated[i]);
      }else{
        System.out.print(rotated[i] + " ");
      }
    }
  }

  public static String[] rotate(String[] arr, int r){
    String[] temp = arr.clone();

    for(int i = 0; i < r; i++){
      String beg = temp[0];

      for(int j = 0; j < temp.length-1; j++){
        temp[j] = temp[j+1];
      }

      temp[temp.length-1] = beg;
    }

    return temp;
  }
}
