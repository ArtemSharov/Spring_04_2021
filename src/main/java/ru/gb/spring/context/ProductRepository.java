package ru.gb.spring.context;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {
    List<Product> productsList = new ArrayList<Product>();
    public Product getProductByID(int id){
        for (int i = 0; i < productsList.size(); i++) {
            if(productsList.get(i).getId() == id){
                return productsList.get(i);
            }
        }
        return null;
    }
   public List<Product> getProductsList(){
        return productsList;
   }

    @PostConstruct
    public void init() {
        productsList = new ArrayList<Product>(Arrays.asList(
                new Product(1,"Rice",3.24f),
                new Product(2,"Sugar",1.4f),
                new Product(3,"Milk",0.8f),
                new Product(4,"Tea",4.1f),
                new Product(5,"Tomato",2.7f)
        ));
    }

}
