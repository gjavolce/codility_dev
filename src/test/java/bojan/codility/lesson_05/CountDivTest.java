package bojan.codility.lesson_05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

public class CountDivTest {

    private CountDiv countDiv;

    @BeforeEach
    void setUp() {
        countDiv = new CountDiv();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test_01() {

        Assert.that(countDiv.solution(6, 11, 2) == 3, "ok");

    }

    @Test
    void test_02() {

        Assert.that(countDiv.solution(10, 10, 5) == 1, "ok");

    }

    @Test
    void test_03() {
        Assert.that(countDiv.solution(0, 1, 15) == 1, "ok");


    }
}
