import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 윤년_2753 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    int year = Integer.parseInt(br.readLine());
    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
