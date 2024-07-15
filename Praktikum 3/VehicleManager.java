import java.util.ArrayList;
import java.util.List;

public class VehicleManager {
    private List<Vehicle> list = new ArrayList<Vehicle>();

    /**
     * Menambahkan kendaraan ke array
     * 
     * @param vehicle objek Vehicle
     */
    public void addVehicle(Vehicle vehicle) {
        // Tambahkan kendaraan ke list
        list.add(vehicle);
    }

    /**
     * Memarkirkan semua kendaraan pada list menggunakan method park pada Vehicle
     */
    public void parkAllVehicles() {
        for (Vehicle vehicle : this.list) {
            vehicle.park();
        }
    }

    /**
     * Membuka semua pintu pada kendaraan yang memiliki pintu menggunakan method
     * openDoor pada Door
     */
    public void openAllDoors() {
        for (Vehicle vehicle : this.list) {
            if(vehicle instanceof Car){
                System.out.println("Car openDoor");
            }
            else if (vehicle instanceof Helicopter){
                System.out.println("Airplane openDoor");
            }
        }
    }

    /**
     * Menutup semua pintu pada kendaraan yang memiliki pintu menggunakan method
     * closeDoor pada Door
     */
    public void closeAllDoors() {
        for (Vehicle vehicle : this.list) {
            if(vehicle instanceof Car){
                System.out.println("Car closeDoor");
            }
            else if (vehicle instanceof Helicopter){
                System.out.println("Airplane closeDoor");
            }
        }
    }

    /**
     * Menyalakan semua mesin pada kendaraan yang memiliki mesin menggunakan method
     * startEngine pada Engine
     */
    public void startAllEngines() {
        for (Vehicle vehicle : this.list) {
            if(vehicle instanceof Car){
                System.out.println("Car startEngine");
            }
            else if (vehicle instanceof Helicopter){
                System.out.println("Airplane startEngine");
            }
            else if (vehicle instanceof Motorcycle){
                System.out.println("Motorcycle startEngine");
            }
        }
    }

    /**
     * Mematikan semua mesin pada kendaraan yang memiliki mesin menggunakan method
     * stopEngine pada Engine
     */
    public void stopAllEngines() {
        for (Vehicle vehicle : this.list) {
            if(vehicle instanceof Car){
                System.out.println("Car stopEngine");
            }
            else if (vehicle instanceof Helicopter){
                System.out.println("Airplane stopEngine");
            }
            else if (vehicle instanceof Motorcycle){
                System.out.println("Motorcycle stopEngine");
            }
        }
    }

    /**
     * Mengganti semua ban pada kendaraan yang memiliki ban menggunakan method
     * changeTyre pada Tyre
     */
    public void changeAllTyres() {
        for (Vehicle vehicle : this.list) {
            if(vehicle instanceof Car){
                System.out.println("Car changeTyre");
            }
            else if (vehicle instanceof Bicycle){
                System.out.println("Bicycle changeTyre");
            }
            else if (vehicle instanceof Motorcycle){
                System.out.println("Motorcycle changeTyre");
            }
        }
    }
}
