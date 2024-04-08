public class Sort {

    // bubble sorting
    public static void bubble(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean v = true;
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    v = false;

                }
            }
            if (v) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = new int[] { 1, 5, 8, 12, 4 };
        bubble(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
