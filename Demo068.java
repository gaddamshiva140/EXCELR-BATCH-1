public class Demo068{
    public static void main(String[] args) {
        
        int[] arr = {10, 21, 30, 41, 50, 63, 72};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { 
                count++;
            }
        }
        System.out.println("Count of even numbers in the array: " + count);
    }
}
