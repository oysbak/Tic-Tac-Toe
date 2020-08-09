import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        scanner.nextInt();  // Don't need this one. Solve the task without creating an array
        boolean isSorted = true;
        int previousInt = Integer.MIN_VALUE;
        int currentInt = 0;
        while (scanner.hasNext()) {
            currentInt = scanner.nextInt();
            if (currentInt < previousInt) {
                isSorted = false;
                break;
            }
            previousInt = currentInt;
        }
        System.out.println(isSorted);
    }
}
