public class 완전_세제곱_4690 {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();

    for (int a = 2; a <= 100; a++) {
      for (int b = 2; b <= a; b++) {
        for (int c = b; c <= a; c++) {
          for (int d = c; d <= a; d++) {
            if (a * a * a == b * b * b + c * c * c + d * d * d) {
              sb.append("Cube = ").append(a).append(", Triple = (").append(b)
                  .append(",").append(c).append(",").append(d).append(")\n");
            }
          }
        }
      }
    }

    System.out.println(sb);
  }

}
