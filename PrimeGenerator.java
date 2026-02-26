import java.util.Scanner;

public class PrimeGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;   // number of primes printed
        int num = 2;     // starting number

        outer:  // label for outer loop
        while (count < N) {

            boolean isPrime = true;

            // inner loop for checking factors
            for (int i = 2; i <= num / 2; i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;   // normal break (factor found)
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }

        sc.close();
    }
}