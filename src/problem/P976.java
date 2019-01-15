package problem;

import java.util.Arrays;

public class P976 {
    public static void main(String[] args) {
        int[] A = {3, 2, 3, 4};
        new P976().largestPerimeter(A);
    }

    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 3; i >= 0; i--) {
            if (A[i] + A[i + 1] > A[i + 2]) {
                return A[i] + A[i + 1] + A[i + 2];
            }
        }
        return 0;
    }
}
