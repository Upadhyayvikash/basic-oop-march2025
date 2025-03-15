package inheritanceexample;

public class InheritanceMainClass {
    public static void main(String[] args) {
        System.out.println(".............vehicle parent class.................");
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();
        vehicle.fueling();

        System.out.println(".............airVehicle child class.................");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.travelOnAir();
        airVehicle.start();
        airVehicle.stop();
        airVehicle.fueling();

        System.out.println(".............waterVehicle child class.................");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.travelOnWater();
        waterVehicle.start();
        waterVehicle.stop();
        waterVehicle.fueling();

        System.out.println(".............roadVehicle child class.................");
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.travelOnRoad();
        roadVehicle.start();
        roadVehicle.stop();
        roadVehicle.fueling();
    }
}
