package bojan.lesson_05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.util.Arrays;

public class GenomicRangeQueryTest {

    private GenomicRangeQuery genomicRangeQuery;

    @BeforeEach
    void setUp() {
        genomicRangeQuery = new GenomicRangeQuery();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test_01() {

        Assert.that(Arrays.equals(genomicRangeQuery.solution("CAGCCTA", new int[]{2, 5, 0},
                new int[]{4, 5, 6}), new int[]{2, 4, 1}), "ok");

    }

//    @Test
    void test_02() {

        Assert.that(Arrays.equals(genomicRangeQuery.solution("AC", new int[]{0,0,1},
                new int[]{0,1,1}), new int[]{1,1,2}), "ok");

    }
}
