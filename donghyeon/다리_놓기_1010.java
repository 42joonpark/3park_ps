import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class 다리_놓기_1010 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int T;
  static int[][] matrix;
  static int max = Integer.MIN_VALUE;
  static BigInteger[] factorial;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    T = Integer.parseInt(br.readLine());
    matrix = new int[T][2];

    for (int i = 0; i < T; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());
      matrix[i][0] = N;
      matrix[i][1] = M;
      max = Math.max(max, M - N);
    }
    factorial = new BigInteger[max + 1];
    factorial[0] = BigInteger.valueOf(1);
    for (int j = 1; j <= max; j++) {
      factorial[j] = factorial[j - 1].multiply(BigInteger.valueOf(j));
    }

    for (int i = 0; i < T; i++) {
      BigInteger answer = BigInteger.valueOf(1);
      for (int v = matrix[i][1]; v > matrix[i][0]; v--) {
        answer = answer.multiply(BigInteger.valueOf(v));
      }
      answer = answer.divide(factorial[matrix[i][1] - matrix[i][0]]);

      sb.append(answer).append("\n");
    }

    System.out.println(sb);
  }


}
