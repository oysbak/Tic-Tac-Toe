package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String cells = scanner.nextLine();
        System.out.println("---------");
        int counter = 0;
        for (char c : cells.toCharArray()) {
            if (counter == 0) {
                System.out.print("| ");
            }
            System.out.print(c + " ");
            if (counter == 2) {
                System.out.println("|");
            }
            counter = (counter + 1) % 3;
        }
        System.out.println("---------");
    }
}
