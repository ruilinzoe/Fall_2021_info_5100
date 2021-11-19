package decoratorDesignPattern;

public class SportsCar extends CarDecorator{

    public SportsCar(Car car) {
        super(car);
    }



    public void assemble() {
        super.assemble();
        System.out.printf("Adding features of Sports Car.");
    }
}
