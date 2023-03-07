package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Backjoon10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int lengh = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        if(arr.length!=lengh) {
            throw new RuntimeException("개수 맞추셈");
        }


        List<Integer> intArr = Arrays.asList(arr).stream().map(r -> Integer.parseInt(r)).collect(Collectors.toList());
        System.out.println(Collections.min(intArr)+" "+Collections.max(intArr));
    }
}
