import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 윳놀이_2490 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    for (int i = 0; i < 3; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int cnt = 0;
      for (int j = 0; j < 4; j++) {
        int value = Integer.parseInt(st.nextToken());
        if (value == 0) cnt++;
      }
      switch (cnt) {
        case 0 :
          sb.append("E").append("\n"); break;
        case 1 :
          sb.append("A").append("\n"); break;
        case 2 :
          sb.append("B").append("\n"); break;
        case 3 :
          sb.append("C").append("\n"); break;
        case 4 :
          sb.append("D").append("\n"); break;
      }
    }
    System.out.print(sb);
  }

}
