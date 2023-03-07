package basic.stage02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2884 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int h = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);
        int an = m - 45;
        if (an >= 0) {
            System.out.println(h + " " + an);
        } else if (h - 1 < 0) {
            System.out.println("23 " + (60 + an));
        } else {
            System.out.println(h - 1 + " " + (60 + an));
        }

    }
}
