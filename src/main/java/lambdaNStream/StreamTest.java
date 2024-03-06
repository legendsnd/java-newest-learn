package lambdaNStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> lis = new ArrayList<>();
        lis.addAll(Arrays.asList(1,2,3,4,5));
        Stream<Integer> squareMap = lis.stream().map(x->x*x);
        int value = squareMap.mapToInt(Integer::intValue).filter(n->n>1).sum();
        System.out.println(value);

    }



}
