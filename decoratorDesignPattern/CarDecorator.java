package decoratorDesignPattern;

abstract class CarDecorator implements Car {

    protected Car tempCar;

    public void assemble() {

        tempCar.assemble();
    }

    public CarDecorator(Car car){
        tempCar=car;
    }
}
