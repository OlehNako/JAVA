package academy.prog.extra.oop.lesson05exceptions;

import academy.prog.extra.oop.lesson02.extraHW.TextTransformer;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Apple", 5, 0);
        Product product2 = new Product("Banana", 10, 1);
        Product product3 = new Product("Cherry", 3, 2);

        Order order = new Order();

        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);

        System.out.println(order);

        try {
            Product product4 = order.searchProductById(5);
            System.out.println(product4);
        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(order.removeProductById(10));
        System.out.println(order);
    }
}
