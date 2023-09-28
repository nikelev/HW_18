package ait.book;

import ait.book.model.Book;

public class BookAppl {
    public static void main(String[] args) {
        Book book = new Book("Журнал по учёту журналов",  1979);
        Book book0 = new Book(2015001,"Thinking in Java", "Брюс Эккель", 2015);
        Book book1 = new Book(2020002,"Clean Code", "Роберт С. Мартин", 2020);
        Book book2 = new Book(2001003,"Effective Java", "Джошуа Блох", 2001);
        Book book3 = new Book(2019004,"Java Concurrency in Practice", "Брайан Гетц", 2019);
        Book book4 = new Book(2023005,"Collection of legends about Java",  2023);

        book.display();
        book0.display();
        book1.display();
        book2.display();
        book3.display();
        book4.display();




    }
}
