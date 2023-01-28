import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간_합_구하기_4_11659 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int N;
  static int M;
  static int[] store;
  static long[] prefixSum;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    store = new int[N];
    prefixSum = new long[N + 1];
    prefixSum[0] = 0;

    StringTokenizer numbers = new StringTokenizer(br.readLine());
    for (int i = 0 ; i < N; i++) {
      store[i] = Integer.parseInt(numbers.nextToken());
      prefixSum[i + 1] = prefixSum[i] + store[i];
    }

    for (int i = 0; i < M; i++) {
      StringTokenizer section = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(section.nextToken());
      int b = Integer.parseInt(section.nextToken());

      long sum = prefixSum[b] - prefixSum[a - 1];
      sb.append(sum);
      sb.append("\n");
    }

    System.out.println(sb);
  }
}
