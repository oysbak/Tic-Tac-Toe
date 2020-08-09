import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        int previous = Integer.MAX_VALUE;
        int next = 0;
        int ascCount = 1;
        int prevAscCount = 0;
        int arrayLength = 0;

//        12 1 2 4 1 2 3 5 7 8 9 10 11

        Scanner scanner = new Scanner(System.in);
        arrayLength = scanner.nextInt();
        // Read array
        for (int i = 0; i < arrayLength; i++) {
            next = scanner.nextInt();
            if (next > previous) {
                ascCount++;
            } else {
                if (ascCount > prevAscCount) {
                    prevAscCount = ascCount;
                }
                ascCount = 1;
            }
            previous = next;
        }
        // Output answer
        System.out.println(ascCount > prevAscCount ? ascCount : prevAscCount);
    }
}
