class Solution {
    public char lastChar(String s) {
        return s.charAt(s.length() - 1);
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "Raj";
        
        System.out.println(sol.lastChar(s));
    }
}
