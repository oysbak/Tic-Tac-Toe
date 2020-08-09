import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        char[][] colors = new char[4][4];
        String line;
        int j = 0;
        for (int i = 0; i < 4; i++) {
            line = scanner.nextLine();
            for (char c : line.toCharArray()) {
                colors[i][j++] = c;
            }
        }

        // Finne liten firkant ...

    }

    public static boolean hasSquare(char[][] matrix, int position) {
        int x1;
        int x2;
        int y1;
        int y2;
        switch (position) {
            case 1:
                x1 = 0;
                x2 = 1;
                y1 = 0;
                y2 = 1;
        }
    }
}
