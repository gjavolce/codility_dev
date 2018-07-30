package bojan.lesson_05;

import bojan.lesson_04.MaxCounters;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.util.Arrays;

public class PassingCarsTest {

    private PassingCars passingCars;

    @BeforeEach
    void setUp() {
        passingCars = new PassingCars();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test_01() {

        int[] x = {0, 1, 0, 1, 1};

        Assert.that(passingCars.solution(x) == 5, "ok");

    }

    @Test
    void test_02() {

        int[] x = {0, 1};

        Assert.that(passingCars.solution(x) == 1, "ok");

    }

    @Test
    void test_03() {

        int[] x = {0, 1, 0, 1};

        Assert.that(passingCars.solution(x) == 3, "ok");

    }

}
