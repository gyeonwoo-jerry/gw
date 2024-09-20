package Lv3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CreateRandomNumber {

    //랜덤숫자 만들기(sublist이용)
    public int [] BaseBallGame() {
        Integer [] array = {1,2,3,4,5,6,7,8,9};
        List<Integer> list = Arrays.asList(array);

        Collections.shuffle(list);
        list.toArray(array);

        int [] random = list.subList(0,3).stream().mapToInt(i->i).toArray();
        return random;
    }
}
