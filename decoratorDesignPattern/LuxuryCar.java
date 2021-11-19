package decoratorDesignPattern;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car car) {
        super(car);
    }

    public void assemble() {
        super.assemble();
        System.out.printf("Adding features of Luxury Car.");
    }
}
