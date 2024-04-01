package pcph;

public class P80 {
    public static void main(String[] args) {
        int a = 5;
        int b = 11;
        int c = a;

        while (true) {
            if (isprime(++c)) {
                break;
            }
        }
        if (b == c) {
            System.out.println("yes");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isprime(int n) {
        for (int j = 2; j * j < n; j++) {
            if (n % j == 0)
                return false;
        }
        return true;
    }
}
