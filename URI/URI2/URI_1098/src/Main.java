public class Main {
    public static void main(String[] args) {

        double I = 0;
        double J = 1;
        double X = 0.2;
        int count = 0;
        for(double i = I; i <= 2.0; i+=0.2, I+=0.2, X+=0.2){
            for(int k = 1; k <= 3; k++){
                System.out.printf("I=%.1f J=%.1f%n", I, J++);
                if(k == 3) {
                    J = 1;
                    J += X;
                }
            }
        }



    }

}