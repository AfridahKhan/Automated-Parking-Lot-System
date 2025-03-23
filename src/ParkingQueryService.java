import java.util.*;

public class ParkingQueryService implements IParkingQuery{
    private TreeMap<Integer,Ticket> occupiedSlots;
    public ParkingQueryService(TreeMap<Integer, Ticket> occupiedSlots) {
        this.occupiedSlots = occupiedSlots;
    }

    @Override
    public void findRegistrationByColor(String color){

    }
    @Override
    public void findSlotByRegistration(String color){

    }
    @Override
    public void findSlotsByColor(String color){

    }
}
