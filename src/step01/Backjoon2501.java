package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon2501 {

    public void 마스터수정함수() {

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        int num = 0;

        for(int i=1; i<n+1 ; i++) {
            if(n%i == 0) {
                num++;
                if (num == k) {
                    System.out.println(i);
                }
            }
        }
        if(num < k) {
            System.out.println(0);
        }
    }
}
