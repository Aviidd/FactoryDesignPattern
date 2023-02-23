package Vehicle;

public class VehicleFactory {
    Vehicle GetVehicle(String input){
        switch(input){
            case "two wheeler":
                return new TwoWheeler();
            case "three wheeler":
                return new ThreeWheeler();
            case "four wheeler":
                return new FourWheeler();
            default:
                return null;
        }
    }
}
