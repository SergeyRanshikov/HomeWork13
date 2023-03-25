public class Book {
    private final String bookName;
    public final String getBookName() {
        return this.bookName;
    }
    public final Author author;
    private int publishingYear;
    public int getPublishingYear(){
        return this.publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public Book (String bookName, Author author, int publishingYear) {
        this.author = author;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }
}
