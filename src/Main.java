public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Лев Толстой");
        Author author2 = new Author("Майкл Джексон");

        Book book1 = new Book("Война и мир ", author1, 2010);
        Book book2 = new Book("Триллер ", author2, 2000);

        System.out.println(book1.getBookName());
        System.out.println(book2.getBookName());
        System.out.println(book1.getPublishingYear());
        System.out.println(book2.getPublishingYear());
        book1.setPublishingYear(2015);
        System.out.println(book1.getPublishingYear());
//        System.out.println(author2.getAuthorName());

    }
}