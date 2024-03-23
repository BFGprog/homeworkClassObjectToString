import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int publishYear;
    //private String book;

    public Book(String name, Author author, int publishYear) {
        this.author = author;
        this.name = name;
        this.publishYear = publishYear;
        //this.book = book;
    }

    public String getName() {
        return this.name;
    }
    public int getPublishYear() {
        return this.publishYear;
    }
    public Author getAuthor() {return author;}

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    // Эксперимент
    public String getBook () {
        return this.name + ", " + this.author + ", " + this.publishYear;
    }

    // ДЗ
    public String toString() {
        return name + ", " + author + ", " + publishYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publishYear);
    }
}
