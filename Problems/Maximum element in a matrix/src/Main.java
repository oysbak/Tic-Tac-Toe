import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int currentValue = 0;
        int maxValue = Integer.MIN_VALUE;
        int rowIndex = 0;
        int columnIndex = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                currentValue = scanner.nextInt();
                if (currentValue > maxValue) {
                    rowIndex = i;
                    columnIndex = j;
                    maxValue = currentValue;
                }
            }
        }
        System.out.println(rowIndex + " " + columnIndex);
    }
}
