import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int passTry, pass = 2002;
        do {
            passTry = sc.nextInt();
            if(passTry == 2002){
                System.out.println("Acesso Permitido");
            }
            else {
                System.out.println("Senha Invalida");
            }
        }while(passTry != pass);
    }
}
