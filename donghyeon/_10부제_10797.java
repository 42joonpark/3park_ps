import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10부제_10797 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int day, car, cnt;

  public static void main(String[] args) throws IOException {
    day = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    while (st.hasMoreTokens()) {
      car = Integer.parseInt(st.nextToken());
      if (day == car) {
        cnt++;
      }
    }

    System.out.println(cnt);
  }

}
