package pl.ttpsc.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private Map<Integer, String> pages = new HashMap<>();
    private String author;
    private String title;
    private int numberOfPages;

    public Book() {}

    public Book(Map<Integer, String> pages, String author, String title) {
        this.pages = pages;
        this.author = author;
        this.title = title;
        this.numberOfPages = pages.size();
    }

    public String getPageContent(int pageNumber) {
        return pages.get(pageNumber);
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
