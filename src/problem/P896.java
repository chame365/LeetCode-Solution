package problem;

public class P896 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        new P896().isMonotonic(nums);
    }

    public boolean isMonotonic(int[] A) {
        Boolean isPositiveSequence = null;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i + 1] - A[i] > 0) {
                if (isPositiveSequence != null && isPositiveSequence.booleanValue() == false) {
                    return false;
                }
                isPositiveSequence = true;
            } else if (A[i + 1] - A[i] < 0) {
                if (isPositiveSequence != null && isPositiveSequence.booleanValue() == true) {
                    return false;
                }
                isPositiveSequence = false;
            }
        }
        return true;
    }
}
