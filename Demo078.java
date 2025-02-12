import java.util.Scanner;

public class Demo078 {
    public static void main(String[] args) {
        int n;
        int[] array;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            n = scanner.nextInt();
            array = new int[n];
            System.out.println("Enter " + n + " numbers: ");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
        }

        System.out.println("Even number:Odd numbers: ");
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + "          ");
                evenCount++;
            } else {
                System.out.print("          " + array[i]);
                oddCount++;
            }
            if (evenCount == oddCount) {
                System.out.println();
            }
        }
    }
}


