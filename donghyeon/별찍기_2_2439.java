import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기_2_2439 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int N;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    N = Integer.parseInt(br.readLine());
    for (int i = 1; i <= N; i++) {
      for (int j = N - i; j >= 1; j--) {
        sb.append(" ");
      }
      for (int j = 1; j <= i; j++) {
        sb.append("*");
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }
}
