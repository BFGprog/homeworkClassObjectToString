public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Кэти", "Сиерра");
        Author author2 = new Author("Барри", "Берд");
        Book book1 = new Book("Head First Java", author1, 2003);
        Book book2 = new Book("Java For Dummies", author2, 2024);
        book2.setPublishYear(2006);

        System.out.println("First book: " + book1.getBook());
        System.out.println("Second book: " + book2.getBook() + "\n");

        // ДЗ
        System.out.println(book1);
        System.out.println(book2);

        // equals
        if (book1.equals(book2)) {
            System.out.println("Киниги равны");
        } else {
            System.out.println("Книги не равны");
        }
        // копия book1
        Book book3 = new Book("Head First Java", author1, 2003);

        if (book1.equals(book3)) {
            System.out.println("Киниги равны");
        } else {
            System.out.println("Книги не равны");
        }

        System.out.println(book1.hashCode());
        System.out.println(book1.getAuthor().hashCode());

    }
}