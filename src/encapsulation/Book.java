package encapsulation;

public class Book {
    // fields (instance variables)
    private String title;
    private String author;
    private boolean borrowed;

    /****************************
     * Constructor
     ****************************/
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }
    // methods (behaviors)
    /****************************
     * Getters
     ****************************/
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    /* Getter for boolean */
    public boolean isBorrowed() {
        return borrowed;
    }

    /*****************************
     * Setters
     *****************************/
    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
}
