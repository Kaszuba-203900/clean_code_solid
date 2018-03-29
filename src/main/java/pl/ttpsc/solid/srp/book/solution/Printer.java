package pl.ttpsc.solid.srp.book.solution;

public class Printer {
    private Book book;

    public Printer(Book book) {
        this.book = book;
    }

    public void printAuthor() {
        System.out.println(book.getAuthor());
    }

    public void printTitle() {
        System.out.println(book.getTitle());
    }

    public void printPage(int pageNumber) {
        System.out.println(book.getPageContent(pageNumber));
    }

    public void printBook() {
        for(int i=0; i<book.getNumberOfPages(); i++) {
            printPage(i);
        }
    }
}
