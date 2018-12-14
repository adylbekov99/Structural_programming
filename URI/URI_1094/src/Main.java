import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numOfTest = sc.nextInt();
        int rabbitCount = 0, ratCount = 0, frogCount = 0, total = 0;
        for(int i = 0; i < numOfTest; i++){
            int numOfAnimals = sc.nextInt();
            String typeOfAnimal = sc.next();
            if(typeOfAnimal.equals("C")){
                rabbitCount += numOfAnimals;
            } else if(typeOfAnimal.equals("R")){
                ratCount += numOfAnimals;
            } else if(typeOfAnimal.equals("S")){
                frogCount += numOfAnimals;
            }
            total += numOfAnimals;
        }
        float rabbitPercentage = (float) ((rabbitCount * 100.0) / total);
        float ratPercentage = (float) ((ratCount * 100.0) / total);
        float frogPercentage = (float) ((frogCount * 100.0) / total);

        System.out.printf("Total: %d cobaias\n", total);
        System.out.printf("Total de coelhos: %d\n", rabbitCount);
        System.out.printf("Total de ratos: %d\n", ratCount);
        System.out.printf("Total de sapos: %d\n", frogCount);
        System.out.printf("Percentual de coelhos: %.2f %%\n", rabbitPercentage);
        System.out.printf("Percentual de ratos: %.2f %%\n", ratPercentage);
        System.out.printf("Percentual de sapos: %.2f %%\n", frogPercentage);
    }
}
