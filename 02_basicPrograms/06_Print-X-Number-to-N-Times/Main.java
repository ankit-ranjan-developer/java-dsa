class Solution {

    public void printX(int X, int N) {
        
        for(int i = 1; i <= N; i++) {
            System.out.print(X);
            if(i != N) System.out.print(" ");
        }

        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int X = 7; int N = 6; 
        sol.printX(X, N);
    }
}
