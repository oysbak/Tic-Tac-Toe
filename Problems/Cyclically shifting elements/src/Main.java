import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            if (i == arrayLength - 1) {
                numbers[0] = scanner.nextInt();
            } else {
                numbers[i + 1] = scanner.nextInt();
            }
        }
        // Output the solution
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
