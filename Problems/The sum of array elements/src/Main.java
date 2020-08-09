import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        scanner.nextInt();  // Don't need this one. Find the sum without creating an array
        int sum = 0;
        while (scanner.hasNext()) {
            sum += scanner.nextInt();
        }
        System.out.println(sum);
    }
}
