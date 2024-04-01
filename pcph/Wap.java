package pcph;

public class Wap {
    public static void main(String[] args) {
        int a[] = new int[] { 1, 2, 5, 6, 7 };
        int v = a[0];
        for (int i = 1; i < a.length; i++) {
            if (v <= a[i - 1]) {
                int temp = v;
                v = a[i - 1];
                a[i] = temp;
            }

        }

        System.out.println(a[1]);
    }
}
