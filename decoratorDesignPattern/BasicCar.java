package decoratorDesignPattern;

public class BasicCar implements Car {

    @Override
    public void assemble() {

        System.out.printf("Basic Car. ");
    }
}
