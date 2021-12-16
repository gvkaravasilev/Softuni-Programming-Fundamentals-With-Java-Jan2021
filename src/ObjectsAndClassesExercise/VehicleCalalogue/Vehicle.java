package ObjectsAndClassesExercise.VehicleCalalogue;

public class Vehicle {
    private String vehicleType;
    private String model;
    private String color;
    private int horsepower;

    public String getVehicleType() {
        return vehicleType;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public Vehicle(String vehicleType, String model, String color, int horsepower){
        this.vehicleType = vehicleType;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;

    }
    public String toString(){

        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                getVehicleType().toUpperCase().charAt(0) + this.vehicleType.substring(1),
                this.model, this.color,
                this. horsepower);
    }

}
