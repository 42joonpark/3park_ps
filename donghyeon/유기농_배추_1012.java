import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 유기농_배추_1012 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int T, M, N, K;
  static int[][] matrix;
  static Stack<Integer[]> stack = new Stack<>();
  static int cnt;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      initMatrix();
      for (int a = 0; a < M; a++) {
        for (int b = 0; b < N; b++) {
          if (matrix[a][b] == 0) {
            continue;
          }
          tracking(a, b);
          while (!stack.isEmpty()) {
            Integer[] pop = stack.pop();
            matrix[pop[0]][pop[1]] = 0;
          }
          cnt++;
          a = 0;
          b = 0;
        }
      }
      sb.append(cnt).append("\n");
    }
    System.out.print(sb);

  }


  private static void initMatrix() throws IOException {
    StringTokenizer st1 = new StringTokenizer(br.readLine());
    M = Integer.parseInt(st1.nextToken());
    N = Integer.parseInt(st1.nextToken());
    K = Integer.parseInt(st1.nextToken());
    matrix = new int[M][N];
    cnt = 0;
    for (int j = 0; j < K; j++) {
      StringTokenizer st2 = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st2.nextToken());
      int b = Integer.parseInt(st2.nextToken());
      matrix[a][b] = 1;
    }
  }

  static void tracking(int i, int j) {
    if (matrix[i][j] == 1) {
      stack.push(new Integer[]{i, j});
      matrix[i][j] = -1;
      // 왼쪽
      if (j - 1 >= 0 && matrix[i][j - 1] == 1) {
        tracking(i, j - 1);
      }
      // 위
      if (i - 1 >= 0 && matrix[i - 1][j] == 1) {
        tracking(i - 1, j);
      }
      // 오른쪽
      if (j + 1 < N && matrix[i][j + 1] == 1) {
        tracking(i, j + 1);
      }
      // 아래
      if (i + 1 < M && matrix[i + 1][j] == 1) {
        tracking(i + 1, j);
      }

    }

  }

}
