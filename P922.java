package problem;

public class P922 {
    public static void main(String[] args) {
        int[] A = {4,2,5,7};
        new P922().sortArrayByParityII(A);
    }

    public int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];
        int ou = 0;
        int ji = 1;
        for (int a : A) {
            if (a % 2 == 0) {
                result[ou] = a;
                ou += 2;
            } else {
                result[ji] = a;
                ji += 2;
            }
        }
        return result;
    }
}
