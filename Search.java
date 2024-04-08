import java.util.Arrays;

public class Search {
    // for array- linear search operation

    public static int searching(Salesman s, Salesman[] a) {

        for (int j = 0; j < a.length; j++) {

            if (s.equals(a[j])) {
                return j;
            }
        }
        return -1;
    }

    public static void bubble(Salesman[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean v = true;
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j].equals(a[j + 1])) {
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

    // public static int searching(String s, String Ss) {
    // for (int i = 0; i < Ss.length(); i++) {
    // // if(Ss.charAt(i)== s){
    // // return i;
    // // }
    // }

    // return -1;
    // }

    public static void main(String[] args) {
        Salesman s = new Salesman("david", 3200);
        // int a[] = { 1, 2, 54, 9, 7, 5 };

        Salesman s1 = new Salesman("param", 2600);
        Salesman s2 = new Salesman("praveen", 2600);
        Salesman s3 = new Salesman("david", 3200);
        Salesman s4 = new Salesman("dav", 5500);
        Salesman s5 = new Salesman("ved", 5500);
        Salesman[] salesmans = { s1, s2, s3, s4, s5 };
        int ind = searching(s, salesmans);
        // if (ind == 1) {
        System.out.println("the index" + ind);

        bubble(salesmans);
        for (int i = 0; i < salesmans.length; i++) {
            System.out.println(salesmans[i]);
        }
        System.out.println(Arrays.toString(salesmans));

    }
}

/**
 * Student
 */
// class Student {
// String name;
// float cpi;

// Student() {
// this.name = name;
// this.cpi = cpi;
// }

// }

class Salesman {
    String prod_id;
    int prod_sale;

    Salesman(String prod_id, int prod_sale) {
        super();
        this.prod_id = prod_id;
        this.prod_sale = prod_sale;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.prod_id = prod_id + "" + prod_sale;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        Salesman man = (Salesman) obj;

        // return this.prod_sale == man.prod_sale && this.prod_sale == man.prod_sale;
        return this.prod_sale > man.prod_sale;
    }
}