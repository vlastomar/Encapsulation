package ShoppingSpreePack;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

public Person(String name, double money){
    this.setName(name);
    this.setMoney(money);
    this.products = new ArrayList<>();
}

    private void setName(String name){
    if (name.length() < 1 || name.trim().isEmpty()){
        throw new IllegalArgumentException("Name cannot be empty");
    }
        this.name = name;
    }

    private void setMoney(double money){
    if (money < 0.0){
        throw new IllegalArgumentException("Money cannot be negative");
    }
        this.money = money;
    }

    public String getName(){
    return this.name;
    }

public void buyProduct(Product product){

    if (this.money < product.getCost()){
        System.out.println(String.format("%s can't afford %s", this.name, product.getName()));
    }else {
        this.setMoney(this.money - product.getCost());
         products.add(product);
        System.out.println(String.format("%s bought %s", this.getName(), product.getName()));

    }

}


    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("%s - ", this.getName()));
    if (this.products.size() == 0){
        sb.append("Nothing bought");
    }else {
        sb.append(this.products.stream()
                .map(Product::getName)
                .collect(Collectors.joining(", ")));
    }

        return sb.toString();
    }
}

