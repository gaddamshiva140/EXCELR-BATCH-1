import java.util.Arrays;

public class Demo076 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Original array: " + Arrays.toString(array));

        int secondMax = findSecondMax(array);

        if (secondMax != Integer.MIN_VALUE) {
            System.out.println("Second maximum number: " + secondMax);
        } else {
            System.out.println("No second maximum number found");
        }
    }

    public static int findSecondMax(int[] array) {
        if (array.length < 2) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }

        return secondMax;
    }
}
