import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int currentProduct = 0;
        int maxProduct = 0;

        for (int i = 1; i < numbers.length; i++) {
            currentProduct = numbers[i - 1] * numbers[i];
            if (currentProduct > maxProduct) {
                maxProduct = currentProduct;
            }
        }
        System.out.println(maxProduct);
    }
}
