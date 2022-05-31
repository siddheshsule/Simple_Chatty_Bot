import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numberOfDigits = 3; // Change this number of digits according to the problem
        int num = scanner.nextInt();
        int result = 0;
        int factor = (int) Math.pow(10, numberOfDigits-1);
        for (int i = numberOfDigits; i > 0; i--) {
            int digit = num % 10;
            result += factor * digit;
            num /= 10;
            factor /= 10;
        }
        System.out.println(result);
    }
}