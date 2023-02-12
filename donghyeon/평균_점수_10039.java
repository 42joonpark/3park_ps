import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 평균_점수_10039 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int answer;
  public static void main(String[] args) throws IOException {
    int sum = 0;
    for (int i = 0; i < 5; i++) {
      int score = Integer.parseInt(br.readLine());
      score = score < 40 ? 40 : score;
      sum += score;
    }
    System.out.println(sum / 5);
  }
}
