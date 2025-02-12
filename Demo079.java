import java.util.Scanner;

public class Demo079 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int n = scanner.nextInt();
            int[] array = new int[n];

            System.out.println("Enter " + n + " numbers: ");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println("Enter the number to search: ");
            int searchNumber = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                if (array[i] == searchNumber) {
                    System.out.println("Number found");
                    return;
                }
            }
        }
        System.out.println("Number not found");
    }
}

