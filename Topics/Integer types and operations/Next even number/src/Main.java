import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int two = 2;
        final int one = 1;
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        if (num < 10_000) {
            if (num % 2 == 0) {
                System.out.println(num + two);
            } else {
                System.out.println(num + one);
            }
        } else {
            System.out.println("The input number should be under 10000.");
        }
    }
}