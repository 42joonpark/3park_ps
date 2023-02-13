import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 대회_or_인턴_2875 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static int N, M, K;

  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());

    int competitionTotal = N + M - K;
    int team = competitionTotal / 3;

    int teamN = N / 2;
    int teamM = M;

    int answer = Math.min(team, teamN);
    answer = Math.min(answer, teamM);
    System.out.println(answer);

  }

}
