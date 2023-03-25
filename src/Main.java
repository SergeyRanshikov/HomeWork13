public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Лев Толстой");
        Author author2 = new Author("Майкл Джексон");

        Book book1 = new Book("Война и мир", author1, 2010);
        Book book2 = new Book("Триллер", author2, 2000);

        System.out.println(book1.getBookName() + ", " + book1.getAuthor().getAuthorName() + ", " + book1.getPublishingYear());
        System.out.println(book2.getBookName() + ", " + book2.getAuthor().getAuthorName() + ", " + book2.getPublishingYear());
        book1.setPublishingYear(2015);
        book2.setPublishingYear(2020);
        System.out.println(book1.getBookName() + ", " + book1.getAuthor().getAuthorName() + ", " + book1.getPublishingYear());
        System.out.println(book2.getBookName() + ", " + book2.getAuthor().getAuthorName() + ", " + book2.getPublishingYear());
    }
}