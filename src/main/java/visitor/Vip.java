package visitor;

public class Vip implements Passenger {

    private String name;
    private String driverLicense;

    public Vip(String name, String driverLicense) {
        this.name = name;
        this.driverLicense = driverLicense;
    }

    @Override
    public void drive(Car car) {
        System.out.println("Vip in taxi");
        car.start();
        car.move(100);
        car.stop();
    }
}
