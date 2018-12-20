import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        String output = "DDD nao cadastrado";
        switch(code) {
            case 61:
                output = "Brasilia";
                break;
            case 71:
                output = "Salvador";
                break;
            case 11:
                output = "Sao Paulo";
                break;
            case 21:
                output = "Rio de Janeiro";
                break;
            case 32:
                output = "Juiz de Fora";
                break;
            case 19:
                output = "Campinas";
                break;
            case 27:
                output = "Vitoria";
                break;
            case 31:
                output = "Bela Horizonte";
                break;
        }
        System.out.println(output);
    }
}
