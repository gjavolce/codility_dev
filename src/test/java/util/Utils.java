package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Utils {

    public static int[] randomArray(int n) {
        int[] randomArray = new int[n];
        Random randNumGenerator = new Random();
        for (int i = 0; i < n; i++) {
            randomArray[i] = randNumGenerator.nextInt() * 256;
        }
        return randomArray;
    }

    public static int[] randomArray(int size, int max, int offset) {

        // generate 100 random number between 0 to 100
        int[] randomIntsArray = IntStream.generate(() -> new Random().nextInt(max)).limit(size).toArray();
        //generate 100 random number between 100 to 200
        int[] randomInts2Array = IntStream.generate(() -> new Random().nextInt(max) + offset).limit(size).toArray();

        return randomIntsArray;

    }

    public static int[] shuffledIntArray(int size, int start) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = start; i < size; i++) {
            list.add(i);
        }
        java.util.Collections.shuffle(list);


        return list.stream().mapToInt(i -> i).toArray();


    }

}
