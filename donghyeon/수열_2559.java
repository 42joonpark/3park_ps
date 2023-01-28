import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수열_2559 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int N;
  static int K;
  static int[] store;
  static int[] prefixSum;
  static int max = Integer.MIN_VALUE;

  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());
    store = new int[N];
    prefixSum = new int[N - K + 1];

    StringTokenizer temperatures = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      store[i] = Integer.parseInt(temperatures.nextToken());
    }

    for (int i = 0; i < K; i++) {
      prefixSum[0] += store[i];
    }
    max = Math.max(prefixSum[0], max);
    for (int i = 1; i <= N - K; i++) {
      prefixSum[i] = prefixSum[i - 1] - store[i - 1] + store[i - 1 + K];
      max = Math.max(prefixSum[i], max);
    }
    System.out.println(max);
  }

}
