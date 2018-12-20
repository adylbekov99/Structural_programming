public class Main {
    public static void main(String[] args) {
        float n = 0;
        float sum = 0;
        System.out.println("i   m(i)");
        System.out.println("----------");
        for (int i = 1; i <= 20 ; i++) {
            n = ((float) i / (i + 1));
            sum += n;
            System.out.printf("%d  %.4f%n",i,sum);

        }

    }
}
