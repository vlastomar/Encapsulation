package SalaryIncrease;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus){
        if (this.getAge() < 30){
            this.setSalary(this.getSalary() + (this.getSalary() * 0.50 * bonus / 100));
        }else {
            this.setSalary(this.getSalary() + (this.getSalary() * bonus / 100));
        }
    }

    @Override
    public String toString() {
        //DecimalFormat vl = new DecimalFormat("#.###");
       // String output = vl.format(this.getSalary());
        String salaryStr = this.getSalary() + "";
        String temp = String.format("%s %s gets %s leva", this.firstName, this.lastName,  salaryStr);
        return temp;
    }
}
