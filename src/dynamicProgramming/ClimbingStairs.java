package dynamicProgramming;

public class ClimbingStairs {
    public static void main(String[] args) {

    }

    public int climbStairs(int n) {
        int a = 0;
        int b = 1;

        for(int i = 0; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
