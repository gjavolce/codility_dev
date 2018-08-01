package bojan.codility.lesson_04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Utils;


public class PermCheckTest {

    private PermCheck permCheck;

    @BeforeEach
    void setUp() {
        permCheck = new PermCheck();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getA() {

        int[] n = Utils.randomArray(10, 10, 0);

        for (int x : n) {
            System.out.print(x + " ");
        }
        System.out.println("-----");
        int[] z = Utils.shuffledIntArray(10, 1);

        for (int x : z) {
            System.out.print(x + " ");
        }

    }
}
