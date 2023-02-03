import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나머지_합_10986 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int N, M;
  static long[] a;
  static long[] s, sm, c;
  static long answer;

  public static void main(String[] args) throws IOException {
    init();

    for (int i = 1; i < N; i++) {
      s[i] = s[i - 1] + a[i];
      sm[i] = s[i] % M;
      c[(int)sm[i]]++;
    }
    answer += c[0];
    for (int i = 0; i < M; i++) {
      if (c[i] >= 2) {
        answer += (c[i] * (c[i] - 1) / 2);
      }
    }
    System.out.println(answer);

  }

  private static void init() throws IOException {
    StringTokenizer st1 = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st1.nextToken());
    M = Integer.parseInt(st1.nextToken());
    a = new long[N];
    s = new long[N];
    sm = new long[N];
    c = new long[M];
    StringTokenizer st2 = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      a[i] = Integer.parseInt(st2.nextToken());
    }
    s[0] = a[0];
    sm[0] = s[0] % M;
    c[(int)sm[0]]++;
  }


}
