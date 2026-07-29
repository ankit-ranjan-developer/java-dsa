import java.util.Scanner;

class Solution {
    public void whichWeekDay(int day) {
        switch (day) {
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thrusday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 7: System.out.println("Sunday");break;
        
            default:
                System.out.println("Invalid");
                break;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        Scanner sc = new Scanner(System.in);

        System.out.print("Day Number : ");
        int num = sc.nextInt();

        sol.whichWeekDay(num);

        sc.close();
    }
}
