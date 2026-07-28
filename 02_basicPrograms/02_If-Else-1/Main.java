import java.util.Scanner;

class Solution {
    public void isAdult(int age) {

        if(age >= 18) System.out.println("Adult");

        if(age < 18) System.out.println("Teen");
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.print("Enter the Age : ");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        sol.isAdult(age);

        sc.close();
    }
}
