import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 약수_1037 {
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static List<Integer> store = new ArrayList<>();

  public static void main(String[] args) throws IOException {
    int T = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < T; i++) {
      store.add(Integer.parseInt(st.nextToken()));
    }

    Collections.sort(store);
    System.out.println(store.get(0) * store.get(store.size() - 1));

  }
}
