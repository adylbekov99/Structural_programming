public class Main {
    public static void main(String[] args) {
        System.out.println("i           m(i)");
        System.out.println("----------------");
        for (double i = 1; i < 1000; i += 100) {
            System.out.printf("%.0f      %.4f%n",i, ePi(i));

        }
    }
    public static double ePi(double n){
        double pi = 0;
        for (int i = 1; i <= n ; i++) {
            pi += (Math.pow(-1, i + 1) / (2 * i - 1));
        }
        pi*=4;
        return pi;
    }
}
