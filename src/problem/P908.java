package problem;

public class P908 {
    public static void main(String[] args) {
        int[] A = {1, 3, 6};
        new P908().smallestRangeI(A, 3);
    }

    public int smallestRangeI(int[] A, int K) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int a : A) {
            if (a > max) {
                max = a;
            }
            if (a < min){
                min = a;
            }
        }
        int result = Integer.MAX_VALUE;
        for (int i = -K; i <= K; i++) {
            for (int j = -K; j <= K; j++) {
                if (Math.abs(min + i - (max + j)) < result){
                    result = Math.abs(min + i - (max + j));
                }
            }
            if (result == 0){
                break;
            }
        }

        return result;
    }
}
