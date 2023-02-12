import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 사파리월드_2420 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static long N, M;

  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    System.out.println(Math.abs(N - M));
  }

}
