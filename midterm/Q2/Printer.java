package Q2;

public class Printer {
    private Printer(){};
    private static Printer _instance;

//    public String name="Default";
    public static Object obj= new Object();

    public static Printer getInstance() {
        if(_instance==null){
            synchronized (obj){
                if (_instance==null){
                    obj=new Printer();
                }
            }
        }
        return _instance;
    }

    public String getConnection() {
        return "Your Printer is working";
    }
}
