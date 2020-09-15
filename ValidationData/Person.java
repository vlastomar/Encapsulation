package ValidationData;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary){
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        if (firstName.length() < 3){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName){
        if (lastName.length() < 3){
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public int getAge(int age){
        return this.age;
    }

    public void setAge(int age){
        if (age <= 0){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        if (salary < 460){
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public void increaseSalary(double bonus){
        if (age < 30){
            setSalary(getSalary() + (getSalary() * 0.50 * bonus / 100));
        }else {
            setSalary(getSalary() + (getSalary() * bonus / 100));
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
