package bojan.lesson_06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public int solution(int[] A) {

        if (A.length <= 1) {
            return A.length;
        }

        Set<Integer> set = new HashSet<>(A.length);
        for (int i : A) {
            set.add(i);
        }
        return set.size();

    }

}
