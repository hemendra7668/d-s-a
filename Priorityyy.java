import java.util.Collections;
import java.util.PriorityQueue;

public class Priorityyy {
    public static void main(String[] args) {
        PriorityQueue<Integer> pw = new PriorityQueue<>();
        PriorityQueue<Integer> maxpw = new PriorityQueue<>(Collections.reverseOrder());
        pw.add(12);
        pw.add(126);
        pw.add(182);
        pw.add(112);
        pw.add(89);
        pw.add(56);
        pw.add(15);
        pw.add(11);
        pw.add(1905);
        pw.add(365);
        pw.add(175);
        pw.add(19);
        pw.add(121);
        pw.add(89);
        maxpw.add(12);
        maxpw.add(126);
        maxpw.add(182);
        maxpw.add(112);
        maxpw.add(89);
        maxpw.add(56);
        maxpw.add(15);
        maxpw.add(11);
        maxpw.add(1905);
        maxpw.add(365);
        maxpw.add(175);
        maxpw.add(19);
        maxpw.add(121);
        maxpw.add(89);
        
        System.out.println(pw);
        System.out.println(maxpw);

    }
}
