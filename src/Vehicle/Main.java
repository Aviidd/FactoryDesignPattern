package Vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactoryobj = new VehicleFactory();
        Vehicle vehicleobj = vehicleFactoryobj.GetVehicle("four wheeler");
        vehicleobj.VehicleType();
    }
}
