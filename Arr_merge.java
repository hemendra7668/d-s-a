
public class Arr_merge {
    public static void main(String[] args) {
        System.out.println("the array merge program....");
        // int a[] = { 5, 16, 9, 12 };
        // int arr[] = new int[34];
        int arr[] = { 5, 16, 9, 12, 1, 5, 12, 89, 7 };
        // int b[] = { 1, 5, 12, 89, 7 };
        // Arrays.sort(a);
        // Arrays.sort(b);

        merge_sort(arr);

        int all = arr.length;
        int k = 0;

        while (k < all) {
            System.out.println(arr[k]);
            k++;
        }

    }

    public static void merge_sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int mid = arr.length / 2;
        int[] leftarr = new int[mid];
        int[] rightarr = new int[arr.length - mid];
        for (int i = 0; i < mid; i++) {
            leftarr[i] = arr[i];
        }
        for (int i = mid, j = 0; i < arr.length && j < rightarr.length; i++, j++) {
            rightarr[j] = arr[i];
        }
        merge_sort(rightarr);
        merge_sort(leftarr);
        arr = merge(leftarr, rightarr);

    }

    public static int[] merge(int a[], int b[]) {
        int a_len = a.length;
        int b_len = b.length;
        int ar[] = new int[a_len + b_len];
        int i = 0, j = 0, pos = 0;
        while (a_len > i && b_len > j) {
            if (a[i] <= b[j]) {
                ar[pos] = a[i];
                i++;
                pos++;
            }

            else {
                ar[pos] = b[j];
                j++;
                pos++;

            }
        }
        while (i < a_len) {
            ar[pos] = a[i];
            i++;
            pos++;
        }

        // Copy remaining elements of R[] if any
        while (j < b_len) {
            ar[pos] = b[j];
            j++;
            pos++;
        }

        return ar;

    }
}
