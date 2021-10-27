package Q1;

public abstract class Book {
    private String title;
    private double price;
    private String publishYear;

    public java.lang.String getTitle() {
        return title;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public java.lang.String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(java.lang.String publishYear) {
        this.publishYear = publishYear;
    }



    public Book (String title, double price, String publishYear){
        this.title=title;
        this.price=price;
        this.publishYear=publishYear;
    }

    abstract String description();
}
