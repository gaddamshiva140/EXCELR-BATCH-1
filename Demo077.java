public class Demo077 {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};

        System.out.println("Original array: ");
        printArray(originalArray);

        int[] copiedArray = copyArray(originalArray);

        System.out.println("Copied array: ");
        printArray(copiedArray);
    }

    public static int[] copyArray(int[] originalArray) {
        int[] copiedArray = new int[originalArray.length];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
        return copiedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}