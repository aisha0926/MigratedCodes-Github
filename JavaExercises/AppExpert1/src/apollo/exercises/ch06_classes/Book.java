package apollo.exercises.ch06_classes;

public class Book {
    private String title;
    private int numPages;
    private User author;
    private String isbn;


    public Book(String title, int numPages, User author, String isbn) {
        this.title = title;
        this.numPages = numPages;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numPages=" + numPages +
                ", author=" + author +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
