package AoC.days;

import AoC.AoCInputFetcher;
import AoC.DayStrategy;

import java.util.Arrays;
import static java.lang.Math.abs;

public class Day1 implements DayStrategy {
    private String input;
    private String[] inputArray;
    private int[] left;
    private int[] right;

    public Day1() {
        AoCInputFetcher AoCInputFetcher = new AoCInputFetcher();
        input = AoCInputFetcher.fetchInput(1);
        inputArray = input.split("\n");

        left = new int[inputArray.length];
        right = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            String[] split = inputArray[i].split("\\s+");
            left[i] = Integer.parseInt(split[0]);
            right[i] = Integer.parseInt(split[1]);
        }

        Arrays.sort(left);
        Arrays.sort(right);
    }

    public String solvePart1() {
        int result = 0;
        for (int i = 0; i < left.length; i++) {
            int l = left[i];
            int r = right[i];
            result += abs(l - r);
        }
        return Integer.toString(result);
    }

    public String solvePart2() {
        int result = 0;
        for (int i = 0; i < left.length; i++) {
            int l = left[i];

            result += countInArray(l, right) * l;
        }
        return Integer.toString(result);
    }

    private static int countInArray(int num, int[] array) {
        int count = 0;
        for (int i : array) {
            if (i == num) {
                count++;
            }
        }
        return count;
    }
}
