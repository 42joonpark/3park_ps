import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치_함수_1003 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int N;
  static int[] store;
  static int[][] matrix;
  static int max = 0;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    N = Integer.parseInt(br.readLine());
    store = new int[N];
    for (int i = 0; i < N; i++) {
      store[i] = Integer.parseInt(br.readLine());
      max = Math.max(store[i], max);
    }

    matrix = new int[max + 1][2];
    matrix[0][0] = 1;
    if (max > 0) {
      matrix[1][1] = 1;
    }

    for (int i = 2; i <= max; i++) {
      matrix[i][0] = matrix[i - 1][0] + matrix[i - 2][0];
      matrix[i][1] = matrix[i - 1][1] + matrix[i - 2][1];
    }

    for (int i = 0; i < N; i++) {
      sb.append(matrix[store[i]][0] + " " + matrix[store[i]][1] + "\n");
    }

    System.out.print(sb);
  }

}
