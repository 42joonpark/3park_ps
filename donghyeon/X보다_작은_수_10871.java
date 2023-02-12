import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class X보다_작은_수_10871 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int N, X;
  static int[] A;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    StringTokenizer st1 = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st1.nextToken());
    X = Integer.parseInt(st1.nextToken());
    A = new int[N];

    StringTokenizer st2 = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st2.nextToken());
      if (A[i] < X) {
        sb.append(A[i]).append(" ");
      }
    }

    System.out.println(sb);
  }
}
