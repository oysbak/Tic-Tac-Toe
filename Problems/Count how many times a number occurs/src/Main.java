import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int anInteger = scanner.nextInt();
        int counter = 0;

        for (int number : numbers) {
            if (number == anInteger) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
