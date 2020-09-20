package AnimalFarmPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String nameChicken = read.readLine();
        int ageChicken = Integer.parseInt(read.readLine());

        try {
            Chicken chicken = new Chicken(nameChicken, ageChicken);

            System.out.println(chicken.toString());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }
}
