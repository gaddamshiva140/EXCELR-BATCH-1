import java.util.Scanner;

public class Demo083 {
    public static void main(String[] args) {
        String str;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            str = scanner.nextLine();
        }

        if (str.length() == 0) {
            System.out.println("String is empty");
        } else {
            char firstChar = str.charAt(0);
            if (isVowel(firstChar)) {
                System.out.println("First character is a vowel");
            } else {
                System.out.println("First character is a consonant");
            }
        }
    }

    public static boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(c) != -1;
    }
}

