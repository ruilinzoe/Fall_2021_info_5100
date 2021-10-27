package Q1;

public class Reference extends Book{
    private String category;
    private String title;
    private double price;
    private String publishYear;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getPublishYear() {
        return publishYear;
    }

    @Override
    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public Reference(String title, double price, String publishYear, String category) {
        super(title, price, publishYear);
        this.category=category;
    }

    @Override
    String description() {
        return getTitle()+"World Maps(title) all information is real.";
    }
}
