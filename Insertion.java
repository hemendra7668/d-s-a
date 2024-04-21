public class Insertion {
    public static void main(String[] args) {
        System.out.println("insertion program...., \n sorted array is");
        int a[] = { 1, 8, 9, 6, 7, 6, 56, 7, 9, 58 };
        insertion(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void insertion(int[] a) {
        for (int i = 1; i < a.length; ++i) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;

            }
            a[j + 1] = key;
        }

    }
}
