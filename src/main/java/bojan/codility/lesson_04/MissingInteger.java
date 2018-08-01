package bojan.codility.lesson_04;

import java.util.HashSet;
import java.util.Set;

/**
 * This is a demo task.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 * <p>
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * <p>
 * Given A = [1, 2, 3], the function should return 4.
 * <p>
 * Given A = [−1, −3], the function should return 1.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
 */
public class MissingInteger {

    public int solution01(int[] A) {

        int smallestMissingInteger = 1;
        if (A.length == 0) {
            return smallestMissingInteger;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                set.add(A[i]);
            }
        }
        while (set.contains(smallestMissingInteger)) {
            smallestMissingInteger++;
        }
        return smallestMissingInteger;

    }

    public int solution02(int[] A) {

        int solution = 1;
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < A.length; ++i) {
            if (A[i] < 1) continue;
            if (hashSet.add(A[i])) {
                //this int was not handled before
                while (hashSet.contains(solution)) {
                    solution++;
                }
            }
        }

        return solution;
    }

    public int solution03(int[] A) {
        int max = A.length;
        int threshold = 1;
        boolean[] bitmap = new boolean[max + 1];

        //populate bitmap and also find highest positive int in input list.
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && A[i] <= max) {
                bitmap[A[i]] = true;
            }

            if (A[i] > threshold) {
                threshold = A[i];
            }
        }

        //find the first positive number in bitmap that is false.
        for (int i = 1; i < bitmap.length; i++) {
            if (!bitmap[i]) {
                return i;
            }
        }

        //this is to handle the case when input array is not missing any element.
        return (threshold + 1);
    }

}
