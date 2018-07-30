package bojan.lesson_04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

public class FrogRiverOneTest {

    private FrogRiverOne frogRiverOne;

    @BeforeEach
    void setUp() {
        frogRiverOne = new FrogRiverOne();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test_01() {

        int[] testArray = {1, 2, 3, 4, 1, 2, 3, 4, 5};

        int x = 5;

        Assert.that(frogRiverOne.solution(x, testArray) == 8, "step 8");


    }

    @Test
    void test_02() {

        int[] testArray = {5, 4, 3, 2, 1};

        int x = 5;

        Assert.that(frogRiverOne.solution(x, testArray) == 4, "step 8");


    }
}
