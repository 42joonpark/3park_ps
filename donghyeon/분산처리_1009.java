import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 분산처리_1009 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int T;
  static int[][] store = new int[][]{
      {10},
      {1},
      {6, 2, 4, 8},
      {1, 3, 9, 7},
      {6, 4},
      {5},
      {6},
      {1, 7, 9, 3},
      {6, 8, 4, 2},
      {1, 9},
  };
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    T = Integer.parseInt(br.readLine());
    int answer;
    for (int i = 0; i < T; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      int n = a % 10;
      int m = b % store[n].length;
      answer = store[n][m];
      sb.append(answer + "\n");
    }

    System.out.print(sb);
  }

}
