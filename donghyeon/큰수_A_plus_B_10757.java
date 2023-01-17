import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class 큰수_A_plus_B_10757 {

  static int[] strToArr(String str) {
    int[] result = new int[str.length()];
    char[] chars = str.toCharArray();

    for (int i = 0; i < str.length(); i++) {
      result[i] = Integer.parseInt(String.valueOf(chars[i]));
    }
    return result;
  }

  static int[] sol(int[] A, int[] B) {
    int max = Math.max(A.length, B.length);
    int[] result = new int[max + 1];

    for (int i = max, a = A.length - 1, b = B.length - 1; i > 0 ; i--, a--, b--) {
      int add;

      if (a >= 0 && b < 0) {
        add = A[a] + result[i];
      } else if (a < 0 && b >= 0) {
        add = B[b] + result[i];
      } else {  // (a >= 0 && b >= 0)
        add = A[a] + B[b] + result[i];
      }

      result[i] = add % 10;
      if (add / 10 > 0) {
        result[i - 1] += add / 10;
      }
    }
    return result;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] A = strToArr(st.nextToken());
    int[] B = strToArr(st.nextToken());

    int[] sol = sol(A, B);
    if (sol[0] != 0) {
      System.out.print(sol[0]);
    }
    for (int i = 1; i< sol.length; i++) {
      System.out.print(sol[i]);
    }
  }




  // 자바에서 큰수를 알아서 계산해주는 클래스가 있었음......... BigInteger 클래스
  static void sol_V1() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    String A = st.nextToken();
    String B = st.nextToken();

    BigInteger AA = new BigInteger(A);
    BigInteger BB = new BigInteger(B);
    BigInteger result = AA.add(BB);
    System.out.println(result);
  }

}
