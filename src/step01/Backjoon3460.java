package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon3460 {

    public static void main(String[] args) throws IOException {
        // 이진수 읽는 법 https://ko.wikihow.com/%EC%9D%B4%EC%A7%84%EC%88%98-%EC%9D%BD%EB%8A%94-%EB%B2%95
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int num = 0;

        while (num<t) {
            num ++;

            int n = Integer.parseInt(br.readLine());
            String binaryN = Integer.toBinaryString(n);

            for(int i=binaryN.length()-1; i>=0 ; i--) {
                if(binaryN.charAt(i)=='1') {
                    System.out.println(binaryN.length()-1-i);
                }
            }

        }

    }
}
