package other;

public class HammingDistance {
    public static void main(String[] args) {

    }

    public int hammingDistance(int x, int y) {
        int temp = x ^ y;
        int count = 0;
        while(temp != 0) {
            count += temp & 1;
            temp >>= 1;
        }
        return count;
    }
}
