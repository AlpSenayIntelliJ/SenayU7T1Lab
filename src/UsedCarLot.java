import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car car) {
        inventory.add(car);
    }

    public boolean swap(int idx1, int idx2) {
        if ((idx1 >= 0 && idx1 < inventory.size()) && (idx2 >= 0 && idx2 < inventory.size())) {
            Car replacedCar = inventory.set(idx1, inventory.get(idx2));
            inventory.set(idx2, replacedCar);
            return true;
        } else {
            return false;
        }
    }
}
