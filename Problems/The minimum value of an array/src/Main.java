import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int minValue = Integer.MAX_VALUE;
        int nextInt = 0;
        for (int i = 0; i < arrayLength; i++) {
            nextInt = scanner.nextInt();
            minValue = nextInt < minValue ? nextInt : minValue;
        }
        System.out.println(minValue);
    }
}
