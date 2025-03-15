package inheritanceexample;

public class WaterVehicle extends Vehicle{
    public void travelOnWater(){
        System.out.println("This vehicles travel on the water");
    }
    @Override
    public void start() {
        System.out.println("Water vehicle has started");
    }

    @Override
    public void stop() {
        System.out.println("Water vehicle has stopped");
    }

    @Override
    public void fueling() {
        System.out.println("Water vehicle has fueled");
    }
}
