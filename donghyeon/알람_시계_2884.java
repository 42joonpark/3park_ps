import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알람_시계_2884 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int H = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int h = M < 45 ? H - 1 : H;
    h = h == -1 ? 23 : h;
    int m = M < 45 ? M + 15 : M - 45;

    sb.append(h).append(" ").append(m).append("\n");
    System.out.println(sb);
  }

}
