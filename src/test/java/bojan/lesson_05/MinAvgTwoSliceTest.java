package bojan.lesson_05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

public class MinAvgTwoSliceTest {

    private MinAvgTwoSlice minAvgTwoSlice;

    @BeforeEach
    void setUp() {
        minAvgTwoSlice = new MinAvgTwoSlice();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test_01() {

        Assert.that(minAvgTwoSlice.solution(new int[]{2, 4, 5, 1, -2}) == 0, "ok");

    }

}
