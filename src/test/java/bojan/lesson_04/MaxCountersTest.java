package bojan.lesson_04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.util.Arrays;

public class MaxCountersTest {

    private MaxCounters maxCounters;

    @BeforeEach
    void setUp() {
        maxCounters = new MaxCounters();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test_01() {

        int[] testArray = {3, 4, 4, 6, 1, 4, 4};

        int N = 5;

        Assert.that(Arrays.equals(maxCounters.solution(N, testArray), new int[]{3, 2, 2, 4, 2}), "step 8");


    }

    @Test
    void test_02() {

        int[] testArray = {1, 2, 1, 2, 3, 4, 5, 6, 1, 2};

        // 1,0,0,0
        // 1,1,0,0
        // 2,1,0,0
        // 2,2,0,0
        // 2,2,1,0
        // 2,2,1,1,
        // 2,2,2,2
        // 2,2,2,2
        // 3, 2,2,2
        // 3,3,2,2

        int N = 4;

        Assert.that(Arrays.equals(maxCounters.solution(N, testArray), new int[]{3,3,2,2}), "step 8");


    }

}
