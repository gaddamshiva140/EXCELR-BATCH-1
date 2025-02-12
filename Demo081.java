import java.util.Arrays;

public class Demo081 {
    public static void main(String[] args) {
        int[] array = {7, 4, 5, 7, 3};

        System.out.println("Original array: " + Arrays.toString(array));

        System.out.print("Leader elements: ");
        for (int i = 0; i < array.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] <= array[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

