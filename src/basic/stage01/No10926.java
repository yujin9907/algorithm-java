package basic.stage01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No10926 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;
        int total = 0;
        List<Integer> xList = new ArrayList();

        ArrayList yList;
        for(yList = new ArrayList(); x > 0; y /= 10) {
            xList.add(x % 10);
            x /= 10;
            yList.add(y % 10);
        }

        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                int result = (int)((double)((Integer)xList.get(j) * (Integer)yList.get(i)) * Math.pow(10.0, (double)(j + i)));
                sum += result;
            }

            System.out.println(sum / (int)Math.pow(10.0, (double)i));
            total += sum;
            sum = 0;
        }

        System.out.println(total);
    }
}
