import java.util.Arrays;

public class Seive {
    public static boolean[] primes() {
        int N = (int) (1e5);
        boolean[] primes = new boolean[N + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < N; i++) {
            for (int j = 2 * i; j < N; j += i) {
                primes[j] = false;
            }
        }
        return primes; //T.C O(Nlog(logN))
                       //S.C O(N)
    }

    public static void main(String[] args) {
        boolean[] primes = primes();
        for (int i = 2; i < 100; i++) {
            if (primes[i])
                System.out.println(i);
        }
    }
}
