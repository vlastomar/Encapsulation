package ShoppingSpreePack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();



        String[] inputPersons = read.readLine().split(";");
        String[] inputProducts = read.readLine().split(";");
        for (int i = 0; i < inputPersons.length ; i++) {
            String[] tokens = inputPersons[i].split("=");
            Person person = new Person(tokens[0], Double.parseDouble(tokens[1]));
            people.putIfAbsent(tokens[0], person);

        }

        for (int i = 0; i < inputProducts.length; i++) {
            String[] tokens = inputProducts[i].split("=");

            Product product = new Product(tokens[0], Double.parseDouble(tokens[1]));
            products.putIfAbsent(tokens[0], product);
        }


        String line = read.readLine();
        while (!"END".equals(line)){
            String[] tokens = line.split("\\s+");

            if (people.containsKey(tokens[0]) && products.containsKey(tokens[1])){
                Person person = people.get(tokens[0]);
                Product product = products.get(tokens[1]);
                person.buyProduct(product);
            }

            line = read.readLine();
        }
        for(Person person : people.values()){
            System.out.println(person);
        }
    }
}
