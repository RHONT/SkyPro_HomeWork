package Java_Core.Home_Work_11;

public class Main {
    public static void main(String[] args) {

        Author author_1 = new Author("Frank", "Rassel");
        Author author_2 = new Author("Gregory", "Roberts");

        Book book_1 = new Book("Wasp", author_1, 1957);
        Book book_2 = new Book("Shantaram", author_2, 2003);

        book_1.setPublicationYear(1959);
    }
}
