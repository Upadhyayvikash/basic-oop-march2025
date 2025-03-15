package inheritanceexample;

public class AirVehicle extends Vehicle{
    public void travelOnAir(){
        System.out.println("This vehicles travel on the air");
    }
    @Override
    public void start() {
        System.out.println("Air vehicle has started");
    }

    @Override
    public void stop() {
        System.out.println("Air vehicle has stopped");
    }

    @Override
    public void fueling() {
        System.out.println("Air vehicle has fueled");
    }
}
