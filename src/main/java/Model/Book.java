package Model;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private String genre;
    private String shelfLocation;

    public Book() {

    }

    public Book(int bookId, String title, String author,
                String genre, String shelfLocation)  {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.shelfLocation = shelfLocation;
    }

    //Getters and setters
    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author;}
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    public String getShelfLocation() { return shelfLocation; }
    public void setShelfLocation(String shelfLocation) { this.shelfLocation = shelfLocation; }
}

