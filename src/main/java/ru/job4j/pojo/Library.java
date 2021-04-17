package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Жизнь и удивительные приключения Робинзона Крузо", 432);
        Book book2 = new Book("Час Быка", 457);
        Book book3 = new Book("Достижение максимума", 352);
        Book book4 = new Book("Мастер и Маргарита", 512);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        book1.setName("Clean code");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " " + book.getPages());
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " " + book.getPages());
        }
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName()
                    .equals("Clean code")) {
                System.out.println(book.getName() + " " + book.getPages());
            }
        }
    }
}
