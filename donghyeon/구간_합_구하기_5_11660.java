import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간_합_구하기_5_11660 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int N, M;
  static int[][] matrix;
  static int[][] rowPrefixSum;
  static int[][] colPrefixSum;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    matrix = new int[N][N];
    rowPrefixSum = new int[N][N];
    colPrefixSum = new int[N][N];

    for (int i = 0; i < N; i++) {
      StringTokenizer row = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        matrix[i][j] = Integer.parseInt(row.nextToken());
        if (j == 0) {
          rowPrefixSum[i][j] = matrix[i][j];
        } else {
          rowPrefixSum[i][j] = rowPrefixSum[i][j - 1] + matrix[i][j];
        }
        if (i == 0) {
          colPrefixSum[i][j] = matrix[i][j];
        } else {
          colPrefixSum[i][j] = colPrefixSum[i - 1][j] + matrix[i][j];
        }
      }
    }

    for (int i = 0; i < M; i++) {
      StringTokenizer coordinate = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(coordinate.nextToken());
      int y1 = Integer.parseInt(coordinate.nextToken());
      int x2 = Integer.parseInt(coordinate.nextToken());
      int y2 = Integer.parseInt(coordinate.nextToken());

      int answer = solution(x1 - 1, y1 - 1, x2 - 1, y2 - 1);
      sb.append(answer);
      sb.append("\n");
    }
    System.out.println(sb);
  }

  static int solution(int x1, int y1, int x2, int y2) {
    int sum = 0;
    if (x2 - x1 < y2 - y1) {
      for (int i = x1; i <= x2; i++) {
        sum += rowPrefixSum[i][y2] - rowPrefixSum[i][y1] + matrix[i][y1];
      }
    } else {
      for (int j = y1; j <= y2; j++) {
        sum += colPrefixSum[x2][j] - colPrefixSum[x1][j] + matrix[x1][j];
      }
    }
    return sum;
  }

}
