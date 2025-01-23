class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 64, 12, 22, 11, 90 };
        bubbleSort(arr);
        for (int num : arr)
            System.out.print(num + " ");
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break; // Array is sorted, no need for further passes
        }
    }
}
