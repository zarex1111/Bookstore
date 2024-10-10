public class Book {
    private int pagesCount;
    private String title;
    private String coverColor;
    private Author author;
    private String publisher;
    private double price;

    public int getPagesCount() {
        return pagesCount;
    }

    public Author getAuthor() {
        return author;
    }

    public String getCoverColor() {
        return coverColor;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book() {
        pagesCount = 100;
        title = "Base title";
        author = new Author("Jane Doe", 1, false);
        coverColor = "Black";
        price = 10.0;
        publisher = "Mr Publish";
    }

    public Book(int pages, String title, Author author, String coverColor, double price, String publisher) {
        pagesCount = pages;
        this.title = title;
        this.author = author;
        this.coverColor = coverColor;
        this.price = price;
        this.publisher = publisher;
    }
}
