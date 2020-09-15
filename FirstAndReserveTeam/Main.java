package FirstAndReserveTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(read.readLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = read.readLine().split(" ");
            try {
                Person person = new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));
                people.add(person);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        Team team = new Team("Black Eagles");
        double bonus = Double.parseDouble(read.readLine());
        for (Person person : people) {
           person.increaseSalary(bonus);
           // System.out.println(person.toString());
            team.addPlayer(person);
        }
        System.out.println(String.format("First team have %d players", team.getFirstTeam().size()));
        System.out.println(String.format("Reserve team have %d players", team.getReserveTeam().size()));

    }
}
