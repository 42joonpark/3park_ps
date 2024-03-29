import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 보물_1026 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int N, answer;
  static int[] A, B;

  public static void main(String[] args) throws IOException {
    init();

    for (int i = 0; i < N; i++) {
      answer += A[N - 1 - i] * B[i];
    }

    System.out.println(answer);

  }

  private static void init() throws IOException {
    N = Integer.parseInt(br.readLine());
    A = new int[N];
    B = new int[N];

    StringTokenizer stA = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(stA.nextToken());
    }

    StringTokenizer stB = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      B[i] = Integer.parseInt(stB.nextToken());
    }
    Arrays.sort(A);
    Arrays.sort(B);
  }
}
