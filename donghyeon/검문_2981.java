import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 검문_2981 {
  static int N;
  static int[] arr;

  /**
   * A1 = a1 * M + r1
   * A2 = a2 * M + r2
   * if r1 == r2 then
   * (A1 - A2) = (a1 - a2) * M
   * 따라서 M은 (A1 - A2)의 약수가 된다.
   *
   * 두 수의 공약수 = 두 수의 최대 공약수의 약수들
   */

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(arr);

    int gcdVal = arr[1] - arr[0];
    for (int i = 2; i < N; i++) {
      gcdVal = gcd(gcdVal, arr[i] - arr[i - 1]);
    }
    StringBuilder sb = new StringBuilder();

    for (int i = 2; i <= gcdVal / 2; i++) {
      if (gcdVal % i == 0) {
        sb.append(i + " ");
      }
    }
    sb.append(gcdVal);
    System.out.println(sb);
  }

  static int gcd(int a, int b) {
    while (b != 0) {
      int r = a % b;
      a = b;
      b = r;
    }
    return a;
  }

  static int gcd_dfs(int p, int q) {
    if (q == 0) return q;
    return gcd_dfs(q, p % q);
  }

}
