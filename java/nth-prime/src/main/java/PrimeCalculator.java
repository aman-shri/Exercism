import java.util.List;
import java.util.ArrayList;

class PrimeCalculator {

    int nth(int nth) {
        if (nth <= 0) {
            throw new IllegalArgumentException();
        }

        List<Integer> primes = new ArrayList<>();
        int num = 2;

        while (primes.size() < nth) {
            boolean isPrime = true;
            for (int prime : primes) {
                if (num % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(num);
            }
            num++;
        }

        return primes.get(nth - 1);
    }

}
