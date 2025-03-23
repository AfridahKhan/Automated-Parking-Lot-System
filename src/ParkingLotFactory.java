public class ParkingLotFactory {
    public static ParkingLotManager createParkingLot(int capacity) {
        return ParkingLotManager.getInstance(capacity);
    }
}
