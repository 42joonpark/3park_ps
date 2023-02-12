import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N찍기_2741 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    int N = Integer.parseInt(br.readLine());
    for (int i = 1; i <= N; i++) {
      sb.append(i).append("\n");
    }
    System.out.println(sb);
  }
}
