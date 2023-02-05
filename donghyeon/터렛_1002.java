import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 터렛_1002 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int N;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    N = Integer.parseInt(br.readLine());
    for (int i = 0; i< N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int r1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());
      int r2 = Integer.parseInt(st.nextToken());

      double d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

      if (d == 0 && r1 == r2) {
        sb.append("-1\n");
      } else if (Math.abs(r1 - r2) > d || r1 + r2 < d) {
        sb.append("0\n");
      } else if (Math.abs(r1 - r2) == d || r1 + r2 == d) {
        sb.append("1\n");
      } else if (Math.abs(r1 - r2) < d || r1 + r2 > d) {
        sb.append("2\n");
      }

    }
      System.out.print(sb);
  }

}
