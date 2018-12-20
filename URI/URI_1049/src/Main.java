import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();
        String animal = "";

        if(first.equals("vertebrado")){
            if(second.equals("ave")){
                if(third.equals("carnivoro")){
                    animal = "aguia";
                } else if(third.equals("onivoro")){
                    animal = "pomba";
                }
            }
            else if(second.equals("mamifero")){
                if(third.equals("onivoro")){
                    animal = "homem";
                }
                else if(third.equals("herbivoro")){
                    animal = "vaca";
                }
            }
        } else if(first.equals("invertebrado")){
            if(second.equals("inseto")){
                if(third.equals("hematofago")){
                    animal = "pulga";
                }
                else if(third.equals("herbivoro")){
                    animal = "lagarta";
                }
            }
            else if(second.equals("anelideo")){
                if(third.equals("hematofago")){
                    animal = "sanguessuga";
                }
                else if(third.equals("onivoro")){
                    animal = "minhoca";
                }
            }
        }
        System.out.println(animal);

    }

}
