package problem;

public class P204 {
    public static void main(String[] args) {
        new P204().countPrimes(10);
    }

    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] prime = new boolean[n];
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }
        double sqrt = Math.sqrt(n - 1);
        for (int i = 2; i <= sqrt; ++i) {
            if (prime[i]) {
                for (int j = i + i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i])
                count++;
        }
        return count;
    }
}
