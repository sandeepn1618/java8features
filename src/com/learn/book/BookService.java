package com.learn.book;

import java.util.Collections;
import java.util.List;

public class BookService {
    public List<Book> getBooksInSort() {
        List<Book> books = new BookDAO().getBooks();
        Collections.sort(books,(o1,o2)->
           o1.getBookName().compareTo(o2.getBookName()));
            return books;

        /*Collections.sort(books,new myComparator());
        return books;*/
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSort());
    }
}
    /*class myComparator  implements Comparator<com.learn.book.Book>{

        @Override
        public int compare(com.learn.book.Book o1, com.learn.book.Book o2) {
            return o1.getBookName().compareTo(o2.getBookName());
        }*/


