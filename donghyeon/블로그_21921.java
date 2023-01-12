import java.io.*;
import java.util.StringTokenizer;

public class 블로그_21921 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer stOne = new StringTokenizer(br.readLine());
    Integer N = Integer.parseInt(stOne.nextToken());
    Integer X = Integer.parseInt(stOne.nextToken());

    int[] visitNums = new int[N];

    StringTokenizer stTwo = new StringTokenizer(br.readLine());
    int sad = 0;
    for (int i = 0; i < N; i++) {
      int v = Integer.parseInt(stTwo.nextToken());
      visitNums[i] = v;
      if (v != 0) {
        sad++;
      }
    }

    if (sad == 0) {
      bw.write("SAD");
      bw.flush();
      return;
    }

    int maxVisit = 0;
    int count = 1;
    int sum = 0;
    int start = 0;
    int end = 0;

    while (start <= (N - X)) {
      while (end - start < X) {
        sum += visitNums[end++];
      }

      if (maxVisit < sum) {
        maxVisit = sum;
        count = 1;
      } else if (maxVisit == sum) {
        count++;
      }
      sum -= visitNums[start++];
    }

    bw.write(maxVisit + "\n" + count);
    bw.flush();
  }
}
