package basic.stage02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2525 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int cook = Integer.parseInt(br.readLine());
        int h = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);
        int an = m + cook;
        h += an / 60;
        m = an % 60;
        if (h > 23) {
            System.out.println(h - 24 + " " + m);
        } else {
            System.out.println(h + " " + m);
        }

    }
}
