package problem;

public class P985 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        new P985().sumEvenAfterQueries(A, queries);
    }

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] result = new int[queries.length];
        int sum = 0;
        for (int i = 0; i < queries.length; i++) {
            A[queries[i][1]] += queries[i][0];
            for (int a : A) {
                if ((a & 1) == 0) {
                    sum += a;
                }
            }
            result[i] = sum;
            sum = 0;
        }
        return result;
    }
}
