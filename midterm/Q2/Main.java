package Q2;

public class Main {
    Printer p1;
    public void main(String[] args) {

        // refers to the only object of Database
        p1= Printer.getInstance();

        p1.getConnection();
    }
}
