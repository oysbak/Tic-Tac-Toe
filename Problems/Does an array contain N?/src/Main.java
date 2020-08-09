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
        boolean doesExist = false;

        for (int number : numbers) {
            if (number == anInteger) {
                doesExist = true;
                break;
            }
        }
        System.out.println(doesExist);
    }
}
