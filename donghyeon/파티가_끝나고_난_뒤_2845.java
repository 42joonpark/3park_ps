import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 파티가_끝나고_난_뒤_2845 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int L, P, person;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    StringTokenizer st1 = new StringTokenizer(br.readLine());
    L = Integer.parseInt(st1.nextToken());
    P = Integer.parseInt(st1.nextToken());
    person = L * P;

    StringTokenizer st2 = new StringTokenizer(br.readLine());
    for (int i = 0; i < 5; i++) {
      int newsPaper = Integer.parseInt(st2.nextToken());
      sb.append(newsPaper - person).append(" ");
    }
    System.out.println(sb);

  }

}
