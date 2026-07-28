import java.util.Scanner;

class Solution {
    public void printNumber(Scanner sc) {
        int num = sc.nextInt();
        System.out.print(num);
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        Scanner sc = new Scanner(System.in);

        sol.printNumber(sc);

        sc.close();
    }
}
