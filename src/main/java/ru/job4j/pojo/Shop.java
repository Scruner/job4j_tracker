package ru.job4j.pojo;

public class Shop {

    public static int indexOfNull(Product[] products) {
        Product[] arrProduct = new Product[5];
        arrProduct[0] = new Product("Milk", 10);
        arrProduct[1] = new Product("Bread", 4);
        arrProduct[2] = new Product("Egg", 19);
        int index = 0;
        for (int i = 0; i < arrProduct.length; i++) {
            if (arrProduct[i] == null) {
                index = i;
                break;
            }
        }
        return index;
    }
}
