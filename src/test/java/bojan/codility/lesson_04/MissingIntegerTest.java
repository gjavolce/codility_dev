package bojan.codility.lesson_04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

public class MissingIntegerTest {

    private MissingInteger missingInteger;

    @BeforeEach
    void setUp() {
        missingInteger = new MissingInteger();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test_01() {

        int[] testArray = {1, 2 , 3};

        Assert.that(missingInteger.solution01(testArray) == 4, missingInteger.solution01(testArray)+"");

    }

    @Test
    void test_02() {

        int[] testArray = {1, 3, 6, 4, 1, 2};

        Assert.that(missingInteger.solution01(testArray) == 5, missingInteger.solution01(testArray)+"");

    }

    @Test
    void test_03() {

        int[] testArray = {-3, -1};

        Assert.that(missingInteger.solution01(testArray) == 1, missingInteger.solution01(testArray)+"");

    }


    @Test
    void test_04() {

        int[] testArray = {100000};

        Assert.that(missingInteger.solution01(testArray) == 1, missingInteger.solution01(testArray)+"");

    }

}
