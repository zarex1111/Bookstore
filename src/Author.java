public class Author {
    private String name;
    private int booksCount;
    private boolean isBestSeller;

    public Author() {}

    public Author(String name, int booksCount, boolean isBestSeller) {
        this.name = name;
        this.booksCount = booksCount;
        this.isBestSeller = isBestSeller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBestSeller() {
        return isBestSeller;
    }

    public int getBooksCount() {
        return booksCount;
    }

    public void setBestSeller(boolean bestSeller) {
        isBestSeller = bestSeller;
    }

    public void setBooksCount(int booksCount) {
        this.booksCount = booksCount;
    }

    public Author(String name) {
        this.name = name;
    }
}
