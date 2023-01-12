import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연산자_끼워넣기_14888 {
  static int N;
  static int[] numbers;
  static int[] operator = new int[4];

  static int MAX = Integer.MIN_VALUE;
  static int MIN = Integer.MAX_VALUE;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    numbers = new int[N];

    StringTokenizer nums_str = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      numbers[i] = Integer.parseInt(nums_str.nextToken());
    }

    StringTokenizer operator_str = new StringTokenizer(br.readLine());
    for (int i = 0; i < 4; i++) {
      operator[i] = Integer.parseInt(operator_str.nextToken());
    }

    dfs(numbers[0], 1);

    System.out.println(MAX);
    System.out.println(MIN);

  }

  static void dfs(int num, int idx) {
     /*탈출조건*/
    if (idx == N) { // idx가 N일때 num은 누적합이 된다.
      MAX = Math.max(MAX, num);
      MIN = Math.min(MIN, num);
      return;
    }
    /*수행동작*/
    for (int i = 0; i < 4; i++) {
      if (operator[i] > 0) {
        operator[i]--;
        switch (i) {
          case 0:   // '+'
            dfs(num + numbers[idx], idx + 1);
            break;
          case 1:   // '-'
            dfs(num - numbers[idx], idx + 1);
            break;
          case 2:   // '*'
            dfs(num * numbers[idx], idx + 1);
            break;
          case 3:   // '/'
            dfs(num / numbers[idx], idx + 1);
            break;
        }
        operator[i]++;
      }
    }

  }

}
