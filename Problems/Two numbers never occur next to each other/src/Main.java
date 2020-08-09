import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        // Create and initialize array
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        // Two numbers
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean isOccurrence = false;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] == n && numbers[i] == m || numbers[i - 1] == m && numbers[i] == n) {
                isOccurrence = true;
            }
        }

        System.out.println(!isOccurrence);
    }
}
