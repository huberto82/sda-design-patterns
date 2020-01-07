package visitor;

public class Tourist implements Passenger {
    private int distance;

    public Tourist(int distance) {
        this.distance = distance;
    }

    @Override
    public void drive(Car car) {
        System.out.println("Passenger in taxi");
        car.start();
        car.move(12);
        car.stop();
    }
}
