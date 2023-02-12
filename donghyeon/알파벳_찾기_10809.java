import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳_찾기_10809 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static String S;
  static int[] alphabet = new int[] {
          -1, -1, -1, -1, -1,
          -1, -1, -1, -1, -1,
          -1, -1, -1, -1, -1,
          -1, -1, -1, -1, -1,
          -1, -1, -1, -1, -1,
          -1
  };
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    S = br.readLine();
    for (int i = 0; i < S.length(); i++) {
      int idx = S.charAt(i) - 'a';
      if (alphabet[idx] == -1) {
        alphabet[idx] = i;
      }
    }

    for (int alpha : alphabet) {
      sb.append(alpha).append(" ");
    }
    System.out.println(sb);

  }
}
