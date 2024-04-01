package pcph;

import java.util.Arrays;
import java.util.Scanner;

public class P138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String[] rhymeScheme = new String[n];
        for (int i = 0; i < n; i++) {
            String[] quatrain = new String[4];
            for (int j = 0; j < 4; j++) {
                quatrain[j] = getSuffix(sc.nextLine(), k);
            }
            if (quatrain[0].equals(quatrain[1]) && quatrain[1].equals(quatrain[2]) && quatrain[2].equals(quatrain[3])) {
                rhymeScheme[i] = "aaaa";
            } else if (quatrain[0].equals(quatrain[1]) && quatrain[2].equals(quatrain[3])) {
                rhymeScheme[i] = "aabb";
            } else if (quatrain[0].equals(quatrain[2]) && quatrain[1].equals(quatrain[3])) {
                rhymeScheme[i] = "abab";
            } else if (quatrain[0].equals(quatrain[3]) && quatrain[1].equals(quatrain[2])) {
                rhymeScheme[i] = "abba";
            } else {
                rhymeScheme[i] = "NO";
            }
        }
        if (Arrays.stream(rhymeScheme).distinct().count() == 1) {
            System.out.println(rhymeScheme[0]);
        } else {
            System.out.println("NO");
        }
    }

    private static String getSuffix(String line, int k) {
        int count = 0;
        for (int i = line.length() - 1; i >= 0; i--) {
            if ("aeiou".contains(String.valueOf(line.charAt(i)))) {
                count++;
            }
            if (count == k) {
                return line.substring(i);
            }
        }
        return "";
    }
}
