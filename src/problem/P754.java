package problem;

public class P754 {
    public static void main(String[] args) {
        new P754().reachNumber(3);
    }
    public int reachNumber(int target) {
        int i = 1;
        int sum = 0;
        while (true){
            sum += i;
            if (sum  >= target && (sum - target)%2 == 0){
                return i;
            }
            i++;
        }
    }
}
