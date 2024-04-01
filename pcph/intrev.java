package pcph;

public class intrev {
    public static void main(String[] args) {
        // int a = 4628;
        // int re = 0;

        // while (a > 0) {
        // int r = a % 10;
        // re = re * 10 + r;
        // a = a / 10;
        // }
        String a = "edc";
        String c[] = a.split("");
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);
        }
    }
}
