package ru.job4j.pojo;

public class ShopDrop {

    public static Product[] delete(Product[] products, int index) {

        for (int i = 0; i < products.length; i++) {
            if (i == index) {
                products[i] = null;
                products[i] = products[i + 1];
                products[i + 1] = null;

            } else if (products[i] != null) {
                       continue;
                    }
                }
        return products;
    }
}

