import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int index = 0;
        int maxValue = numbers[index];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                index = i;
                maxValue = numbers[i];
            }
        }
        System.out.println(index);
    }
}
