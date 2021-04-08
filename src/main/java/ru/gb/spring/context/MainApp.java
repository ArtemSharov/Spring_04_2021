package ru.gb.spring.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductRepository productRepository = context.getBean("productRepository", ProductRepository.class);
        System.out.println("ProductRepository: " + productRepository.getProductsList().toString());
        Cart cart1 = context.getBean("cart", Cart.class);
        Cart cart2 = context.getBean("cart", Cart.class);
        System.out.println("Cart1");
        cart1.addProduct(2);
        cart1.addProduct(4);
        System.out.println(cart1.getCartList());
        cart1.deleteProductByID(4);
        cart1.deleteProductByID(5);
        System.out.println(cart1.getCartList());
        System.out.println();
        System.out.println("Cart2");
        cart2.addProduct(1);
        cart2.addProduct(3);
        cart2.addProduct(5);
        System.out.println(cart2.getCartList());
        cart2.deleteProductByID(4);
        cart2.deleteProductByID(3);
        System.out.println(cart2.getCartList());
    }
}
