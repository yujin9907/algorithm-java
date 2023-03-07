package basic.stage01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class No3003 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int king = 1 - s.nextInt();
        int queen = 1 - s.nextInt();
        int bishop = 2 - s.nextInt();
        int look = 2 - s.nextInt();
        int nite = 2 - s.nextInt();
        int pon = 8 - s.nextInt();
        System.out.println(king + " " + queen + " " + bishop + " " + look + " " + nite);
    }

    public void solve1() {
        Scanner sc = new Scanner(System.in);
        List<Integer> whites = new ArrayList();

        for(int i = 0; i < 5; ++i) {
            int a = sc.nextInt();
            whites.add(a);
        }

        White w = new White(whites);
        w = w.mius(w);
        Iterator var5 = whites.iterator();

        while(var5.hasNext()) {
            Integer piece = (Integer)var5.next();
            System.out.println(piece);
        }

    }
}
