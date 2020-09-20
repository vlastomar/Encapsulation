package AnimalFarmPack;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age){
    this.setName(name);
    this.setAge(age);
    }

    private void setName(String name) {
        if (name.length() < 1){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age){
        if (age <= 0 || age >= 15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private double calculateProductPerDay(){
        double eggsPerDay = 0;
        if (this.age < 6){
            eggsPerDay = 2;
        }else if (this.age < 12 && this.age >= 6){
            eggsPerDay = 1;
        }else if (this.age > 11 && this.age < 15){
            eggsPerDay = 0.75;
        }
        return eggsPerDay;
    }

    public double ProductPerDay(){
        Chicken chicken = new Chicken(this.name, this.age);
        return chicken.calculateProductPerDay();
    }


    @Override
    public String toString() {
        Chicken chicken = new Chicken(this.name, this.age);
        return  "Chicken" + this.name + "(age " + this.age + ") can produce " +  chicken.ProductPerDay() +" eggs per day.";
    }
}
