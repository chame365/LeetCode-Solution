package problem;

public class P905 {
    public static void main(String[] args) {
        new P905().sortArrayByParity(new int[]{1, 2, 3, 4, 5, 6});
    }

    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int left = 0, right = A.length - 1;
        for (int a : A) {
            if (a % 2 == 0) {
                result[left] = a;
                left++;
            } else {
                result[right] = a;
                right--;
            }
        }
        return result;
    }
}
