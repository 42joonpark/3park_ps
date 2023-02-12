import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 구구단_2739 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    int N = Integer.parseInt(br.readLine());

    for (int i = 1; i <= 9; i++) {
      System.out.printf("%d * %d = %d\n", N, i, N * i);
    }

  }
}
