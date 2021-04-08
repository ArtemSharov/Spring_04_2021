package ru.gb.spring.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    ProductRepository productRepository;
    @Autowired
    public Cart(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    List<Product> cartList = new ArrayList<Product>();

    public void deleteProductByID(int id) {
            if(cartList.contains(productRepository.getProductByID(id))){
                cartList.remove(productRepository.getProductByID(id));
                System.out.println(productRepository.getProductByID(id).getName() + " is deleted");
            } else{
                System.out.println("The product with this ID is not in the shopping cart");
            }
    }

    public void addProduct(int id){
        cartList.add(productRepository.getProductByID(id));
        System.out.println(productRepository.getProductByID(id).getName() + " is added");
    }
    public List<Product> getCartList(){
        return cartList;
    }
}
