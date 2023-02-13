import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 플러그_2010 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int N;
  static int cnt;

  public static void main(String[] args) throws IOException {
    N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      int plug = Integer.parseInt(br.readLine());
      if (i == N - 1) {
        cnt += plug;
      } else {
        cnt += (plug - 1);
      }
    }
    System.out.println(cnt);
  }

}
