public class Sort {

    // bubble sorting
    public static void bubble(Salesman[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean v = true;
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j].prod_sale > a[j + 1].prod_sale) {
                    Salesman temp = a[j];
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
        // int a[] = new int[] { 1, 5, 8, 12, 4 };
        Salesman s1 = new Salesman("param", 2600);
        Salesman s2 = new Salesman("praveen", 2600);
        Salesman s3 = new Salesman("david", 3200);
        Salesman s4 = new Salesman("dav", 5500);
        Salesman s5 = new Salesman("ved", 5500);
        Salesman s6 = new Salesman("ed", 5500);
        Salesman a[] = { s1, s2, s3, s4, s5, s6 };
        bubble(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].toString());
        }
    }

}
