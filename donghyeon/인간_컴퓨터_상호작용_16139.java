import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 인간_컴퓨터_상호작용_16139 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuilder sb = new StringBuilder();
  static int[][] matrix;
  static int[] check = new int[26];

  public static void main(String[] args) throws IOException {
    String S = br.readLine();
    matrix = new int[S.length()][26];
    int q = Integer.parseInt(br.readLine());


    for (int i = 0; i < q; i++) {
      String ai = br.readLine();
      StringTokenizer st = new StringTokenizer(ai, " ");
      String ctr = st.nextToken();
      char alphabet = ctr.charAt(0);
      int l = Integer.parseInt(st.nextToken());
      int r = Integer.parseInt(st.nextToken());

      int alphabetIdx = alphabet - 'a';
      if (check[alphabetIdx] == 0) {
        for (int k = 0; k < S.length(); k++) {
          char c = S.charAt(k);
          if (k == 0 && alphabet == c) {
            matrix[k][alphabetIdx] = 1;
          } else if (k == 0 && alphabet != c) {
            matrix[k][alphabetIdx] = 0;
          } else if (k > 0 && alphabet == c) {
            matrix[k][alphabetIdx] = matrix[k - 1][alphabetIdx] + 1;
          } else if (k > 0 && alphabet != c) {
            matrix[k][alphabetIdx] = matrix[k - 1][alphabetIdx];
          }
        }
      }
      check[alphabetIdx]++;

      int answer;
      if (l - 1 < 0) {
        answer = matrix[r][alphabetIdx];
      } else {
        answer = matrix[r][alphabetIdx] - matrix[l - 1][alphabetIdx];
      }
      sb.append(answer + "\n");
    }

    System.out.print(sb);
  }


}
