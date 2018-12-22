package problem;

public class P832 {
    public static void main(String[] args) {
        new P832().flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}});
    }

    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] a : A) {
            filpAndReverse(a);
        }
        return A;
    }

    public int[] filpAndReverse(int[] a) {
        for (int i = 0, j = a.length - 1; i < (a.length) / 2; i++, j--) {
            a[i] = a[i] ^ a[j];
            a[j] = a[j] ^ a[i];
            a[i] = a[j] ^ a[i];
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] ^ 1;
        }
        return a;
    }
}
