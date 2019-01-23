package problem;

import java.util.Random;

public class P374 {
    public static void main(String[] args) {
        new P374().guessNumber(10);
    }

    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end){
            int mid = (start + end) / 2;
            int guessResult = guess(mid);
            if (guessResult == 0) {
                return mid;
            } else if (guessResult == 1){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }

    public int guess(int n) {
        if (n == 6){
            return 0;
        } else if (n > 6){
            return 1;
        } else {
            return -1;
        }
    }
}
