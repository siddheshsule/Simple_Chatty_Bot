import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int l = 6;//Total number of user inputs
        int hoursToSeconds = 3600;
        int minsToSeconds = 60;
        List<Integer> timeList = new ArrayList<Integer>();
        for (int i = 0; i < l; i++) {
            int timeEntry = scanner.nextInt();
            timeList.add(timeEntry);
        }
        int result = ((timeList.get(3) - timeList.get(0)) * hoursToSeconds)+
                ((timeList.get(4)-timeList.get(1)) * minsToSeconds) +
                ((timeList.get(5) - timeList.get(2)));
        System.out.println(result);
    }
}
