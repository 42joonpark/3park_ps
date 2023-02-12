import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 디지털_루트_6378 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    while (true) {
      String N = br.readLine();
      if (N.equals("0")) break;

      int sum = 0;
      for (int i = 0 ; i < N.length(); i++) {
         sum += N.charAt(i) - '0';
      }
      dfs(sum);
    }
    System.out.print(sb);
  }

  static void dfs(int num) {
    if (num < 10) {
      sb.append(num).append("\n");
      return;
    }
    int tmp = 0;
    while (num != 0) {
      tmp += (num % 10);
      num /= 10;
    }
    dfs(tmp);
  }

}
