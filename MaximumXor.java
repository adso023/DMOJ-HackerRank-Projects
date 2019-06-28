import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MaximumXor{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //Array of numbers
    int numArr = Integer.parseInt(br.readLine());
    String[] a = br.readLine().split(" ");
    int[] arr = new int[numArr];
    for(int i = 0; i < numArr; i++){
      arr[i] = Integer.parseInt(a[i]);
    }

    //Array of Query Numbers
    int numQ = Integer.parseInt(br.readLine());
    int[] queries = new int[numQ];
    for(int i = 0; i < numQ; i++){
      queries[i] = Integer.parseInt(br.readLine());
    }

    int[] manXor = maximumXor(arr, queries);

    System.out.println();
    for(int i = 0; i < manXor.length; i++){
      if(i != manXor.length - 1){
        System.out.println(manXor[i]);
      }else{
        System.out.print(manXor[i] + " ");
      }
    }
  }

  static int[] maximumXor(int[] arr, int[] queries){
    int[] temp = new int[queries.length];

    for(int i = 0; i < queries.length; i++){
      int max = 0;
      for(int j = 0; j < arr.length; j++){
        int xored = queries[i] ^ arr[j];

        //System.out.println(queries[i] + "^" + arr[j] + " max: " + xored);
        if(max < xored){
          max = xored;
        }
      }
      temp[i] = max;
    }

    return temp;
  }
}
