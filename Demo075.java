public class Demo075 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Original array: ");
        printArray(array);

        int max = findMax(array);

        System.out.println("Maximum number: " + max);
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}