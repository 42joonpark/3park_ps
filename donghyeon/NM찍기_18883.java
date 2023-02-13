import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NM찍기_18883 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int N, M;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    int value = 1;
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= M; j++) {
        sb.append(value);
        if (j == M)
          sb.append("\n");
        else
          sb.append(" ");
        value++;
      }
    }

    System.out.println(sb);

  }

}
