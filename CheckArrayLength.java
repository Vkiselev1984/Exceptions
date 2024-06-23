import java.util.Scanner;

public class CheckArrayLength {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the length of the array: ");
            int length = scanner.nextInt();
            
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }
            
            CheckArrayLength checker = new CheckArrayLength();
            int minSize = 5; // Specify the minimum size here
            int result = checker.checkArrayLength(arr, minSize);
            
            if (result == -1) {
                System.out.println("Error: Array length is less than " + minSize);
            } else {
                System.out.println("Array length is: " + result);
            }
        }
    }

    public int checkArrayLength(int[] arr, int minSize) {
        if (arr.length < minSize) {
            return -1;
        } else {
            return arr.length;
        }
    }
}