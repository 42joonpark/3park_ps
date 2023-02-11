import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 체스판_다시_칠하기_1018 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int M, N;
  static char[][] matrix;
  static int min = Integer.MAX_VALUE;

  public static void main(String[] args) throws IOException {
    init();

    for (int i = 0; i <= N - 8; i++) {
      for (int j = 0; j <= M - 8; j++) {
        // Black 으로 시작하는 경우
        int black = reTouch(i, j, 'W', 'B');
        min = Math.min(min, black);
        // White 로 시작하는 경우
        int white = reTouch(i, j, 'B', 'W');
        min = Math.min(min, white);
      }
    }
    System.out.println(min);
  }


  private static void init() throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    matrix = new char[N][M];

    for (int i = 0; i < N; i++) {
      String s = br.readLine();
      for (int j = 0; j < M; j++) {
        matrix[i][j] = s.charAt(j);
      }
    }
  }

  private static int reTouch(int i, int j, char c1, char c2) {
    int cnt = 0;
    for (int a = i, p = 0; a < i + 8; a++, p++) {
      for (int b = j, q = 0; b < j + 8; b++, q++) {
        if ((p % 2 == 0 && q % 2 == 0) || (p % 2 != 0 && q % 2 != 0)) {
          if (matrix[a][b] == c1) {
            cnt++;
          }
        } else {
          if (matrix[a][b] == c2) {
            cnt++;
          }
        }
      }
    }
    return cnt;
  }
}
