public class Books {
    private String name,author;
    private int bookid,price,booksnumber;

    public Books(String name, String author, int bookid, int price, int booksnumber) {
        this.name = name;
        this.author = author;
        this.bookid = bookid;
        this.price = price;
        this.booksnumber = booksnumber;
    }

    public Books() {
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", bookid=" + bookid +
                ", price=" + price +
                ", booksnumber=" + booksnumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBooksnumber() {
        return booksnumber;
    }

    public void setBooksnumber(int booksnumber) {
        this.booksnumber = booksnumber;
    }
}
