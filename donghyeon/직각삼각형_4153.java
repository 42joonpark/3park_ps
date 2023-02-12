import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 직각삼각형_4153 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int[] tAngle = new int[3];
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int i = 0; i < 3; i++) {
        tAngle[i] = Integer.parseInt(st.nextToken());
      }
      if (tAngle[0] == 0 && tAngle[1] == 0 && tAngle[2] == 0) {
        break;
      }
      Arrays.sort(tAngle);
      if (Math.pow(tAngle[0], 2) + Math.pow(tAngle[1], 2) == Math.pow(tAngle[2], 2)) {
        sb.append("right").append("\n");
      } else {
        sb.append("wrong").append("\n");
      }
    }
    System.out.println(sb);
  }

}
