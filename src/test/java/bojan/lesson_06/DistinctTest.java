package bojan.lesson_06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Utils;


public class DistinctTest {


    private Distinct distinct;

    @BeforeEach
    void setUp() {
        distinct = new Distinct();
    }

    @Test
    void test01() {

        int[] a = Utils.randomArray(10, 100, -50);
        int[] b = new int[]{-1, -2, -3, -1, -2};
        Utils.printArray(b);
        System.out.println(distinct.solution(b));
    }
}
