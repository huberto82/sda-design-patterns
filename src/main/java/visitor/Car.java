package visitor;

public class Car implements Taxi {

    private int counter;
    private boolean isStarted;

    public Car(int counter) {
        this.counter = counter;
        this.isStarted = false;
    }

    @Override
    public void acceptPassenger(Passenger visitor) {
        visitor.drive(this);
    }

    public void start(){
        isStarted = true;
        System.out.println("Car started");
    }

    public void stop(){
        isStarted = false;
        System.out.println("Car stopped");
    }

    public int move(int distance){
        System.out.println("The car is driving");
        if (isStarted) {
            counter += distance;
            return 0;
        } else {
            return distance;
        }
    }

    public int getCounter() {
        return counter;
    }
}
