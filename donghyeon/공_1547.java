import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 공_1547 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int M;
  static int[] arr = new int[]{1, 0, 0};

  public static void main(String[] args) throws IOException {
    M = Integer.parseInt(br.readLine());
    for (int i = 0; i < M; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int X = Integer.parseInt(st.nextToken()) - 1;
      int Y = Integer.parseInt(st.nextToken()) - 1;

      int tmp;
      tmp = arr[X];
      arr[X] = arr[Y];
      arr[Y] = tmp;
    }
    for (int i = 0 ; i < 3; i++) {
      if (arr[i] == 1) {
        System.out.println(i + 1);
        break;
      }
    }
  }

}
