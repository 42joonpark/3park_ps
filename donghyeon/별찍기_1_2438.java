import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기_1_2438 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        sb.append("*");
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }

}
