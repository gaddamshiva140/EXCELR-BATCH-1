import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo073 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 9, 1};

        System.out.println("Duplicate elements (Method 1 - Nested Loops):");
        findDuplicatesNestedLoops(arr);

        System.out.println("\nDuplicate elements (Method 2 - HashSet):");
        findDuplicatesHashSet(arr);

        System.out.println("\nDuplicate elements (Method 3 - Sorting):");
        findDuplicatesSorting(arr);
    }

    public static void findDuplicatesNestedLoops(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public static void findDuplicatesHashSet(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }

        System.out.println(duplicates);
    }

    public static void findDuplicatesSorting(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i] + " ");
                while (i < arr.length - 1 && arr[i] == arr[i+1]) {
                    i++;
                }
            }
        }
        System.out.println();
    }
}