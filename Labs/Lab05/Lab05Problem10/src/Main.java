public class Main {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int num = 2;

        System.out.println("The first 50 prime numbers are ");

        while (count < NUMBER_OF_PRIMES){
            boolean isPrime = true;

            for (int divisor = 2; divisor <= num / 2 ; divisor++) {
                if (num % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.println(num);
                }
                else
                    System.out.print(num + " ");
            }
            num++;
        }
    }
}
