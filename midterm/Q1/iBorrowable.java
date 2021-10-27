package Q1;

public interface iBorrowable {
    int day=0;
    int borrowDay=0;
    int returnDay=0;
    public void setBorrowDate(int day);
    public void setReturnDate(int day);
    public boolean isAvailable(int day);

}
