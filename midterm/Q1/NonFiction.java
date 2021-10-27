package Q1;

public class NonFiction extends Book implements iBorrowable{
    private String title;
    private double price;
    private String publishYear;
    int BorrowDate;
    int ReturnDate;

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

    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);

    }

    @Override
    String description() {
        return getTitle()+"all events are true and based on real facts.";
    }

    @Override
    public void setBorrowDate(int day) {
        this.BorrowDate=day;
    }

    @Override
    public void setReturnDate(int day) {
        this.ReturnDate=day;
    }

    @Override
    public boolean isAvailable(int day) {
        if(day<=returnDay&&day>=borrowDay){
            return true;
        }else {
            return false;
        }
    }

}
