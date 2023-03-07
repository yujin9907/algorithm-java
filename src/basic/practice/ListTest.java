package basic.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {

    List<Integer> testList = Arrays.asList(1, 2, 3, 4, 5);

    public void StreamList() {
    }

    public void 중복제거하기() {
        List<Integer> newList = (List)this.testList.stream().distinct().collect(Collectors.toList());
    }

    public void remove() {
        this.testList.remove(0);
        this.testList.remove(new Integer(1));
    }

    public void 최대최소구하기() {
        int max = (Integer) Collections.max(this.testList);
        int min = (Integer)Collections.min(this.testList);
    }

    public void 배열과리스트() {
        int[] li = new int[]{1, 2, 3, 4};
        List<int[]> arrayToList = Arrays.asList(li);
        Object[] listToArray = this.testList.toArray();
    }
}
