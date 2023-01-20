import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 빙고_2578 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int[][] bingGo = new int[5][5];
  static int[] sequence = new int[25];
  static int y;
  static int x;
  static int idx;
  /** result
   *  0 ~ 4 : 가로
   *  5 ~ 9 : 세로
   *  10 : 왼쪽 위에서 오른쪽 아래 대각선
   *  11 : 왼쪽 아래에서 오른쪽 위 대각선
   */
  static int[] result = new int[12];

  public static void main(String[] args) throws IOException {
    initBingGo();
    initSequence();

    for (int i = 0; i < 25; i++) {
      int[] position = removeNum(sequence[i]);
      if (i >= 4) {
        int row = position[0];
        int col = position[1];
        // 가로
        rowCheck(row);
        // 세로
        colCheck(col);
        // 대각선
        backslashLineCheck(row, col);
        slashLineCheck(row, col);
        // 빙고 확인
        int cnt = 0;
        for (int e = 0; e < result.length; e++) {
          if (result[e] == 1) {
            cnt++;
          }
          if (cnt == 3) {
            System.out.println(i + 1);
            return;
          }
        }
      }
    }
  }

  static void slashLineCheck(int row, int col) {
    if (row + col == 4) {
      int d;
      for (d = 0; d < 5; d++) {
        if (bingGo[d][4 - d] != 0) {
          break;
        }
      }
      if (d == 5) {
        result[11] = 1;
      }
    }
  }

  static void backslashLineCheck(int row, int col) {
    if (row == col) {
      int c;
      for (c = 0; c < 5; c++) {
        if (bingGo[c][c] != 0) {
          break;
        }
      }
      if (c == 5) {
        result[10] = 1;
      }
    }
  }

  static void colCheck(int col) {
    int b;
    for (b = 0; b < 5; b++) {
      if (bingGo[b][col] != 0) {
        break;
      }
    }
    if (b == 5) {
      result[col + 5] = 1;
    }
  }

  static void rowCheck(int row) {
    int a;
    for (a = 0; a < 5; a++) {
      if (bingGo[row][a] != 0) {
        break;
      }
    }
    if (a == 5) {
      result[row] = 1;
    }
  }

  static void initBingGo() throws IOException {
    for (int i = 0; i < 5; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      while (st.hasMoreTokens()) {
        bingGo[y][x++] = Integer.parseInt(st.nextToken());
        if (x == 5) {
          y++;
          x = 0;
        }
      }
    }
  }

  static void initSequence() throws IOException {
    for (int i = 0; i < 5; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      while (st.hasMoreTokens()) {
        sequence[idx++] = Integer.parseInt(st.nextToken());
      }
    }
  }

  static int[] removeNum(int num) {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if (bingGo[i][j] == num) {
          bingGo[i][j] = 0;
          return new int[] {i, j};
        }
      }
    }
    return null;
  }


}
