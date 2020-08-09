import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int countTriples = 0;
        if (numbers.length >= 3) {
            int first = 0;
            int second = numbers[0];
            int third = numbers[1];

            for (int i = 2; i < numbers.length; i++) {
                first = second;
                second = third;
                third = numbers[i];
                if (first + 1 == second && second + 1 == third) {
                    countTriples++;
                }
            }
        }
        System.out.println(countTriples);
    }
}
