import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numberOfDesks = 0;
        int numberOfGroups = 3;
        for (int i = numberOfGroups; i > 0; i--) {
            int numberOfStudents = scanner.nextInt();
            if (numberOfStudents % 2 == 0) {
                numberOfDesks += numberOfStudents / 2;
            } else {
                numberOfDesks += numberOfStudents / 2 + 1;
            }
        }
        System.out.println(numberOfDesks);
    }
}