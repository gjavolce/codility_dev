package bojan.codility.lesson_04;

public class PermCheck {

    public int solution(int[] A) {

        int[] mark = new int[A.length + 1];

        int counter = 0;

        for (int i = 0; i < A.length; ++i) {
            int value = A[i];
            if (value >= mark.length) {
                return 0;
            }
            if (mark[value] == 0) {
                mark[value] = 1;
                ++counter;

            } else {
                return 0;
            }
        }

        return counter == A.length ? 1 : 0;

    }
}
