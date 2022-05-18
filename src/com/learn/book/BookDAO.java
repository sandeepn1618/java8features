package com.learn.book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"C",150));
        books.add(new Book(2,"B",149));
        books.add(new Book(3,"A",123));
        return books;
    }


}
