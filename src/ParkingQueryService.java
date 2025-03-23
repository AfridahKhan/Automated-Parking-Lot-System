import java.util.*;

public class ParkingQueryService implements IParkingQuery{
    private TreeMap<Integer,Ticket> occupiedSlots;
    public ParkingQueryService(TreeMap<Integer, Ticket> occupiedSlots) {
        this.occupiedSlots = occupiedSlots;
    }

    @Override
    public void findRegistrationByColor(String color){
        List<String> regNumbers = new ArrayList<>();
        for(Ticket ticket: occupiedSlots.values()){
            if(ticket.getCar().getColor().equalsIgnoreCase(color)){
                regNumbers.add(ticket.getCar().getRegistrationNumber())
            }
        }
        System.out.println(regNumbers.isEmpty() ? "Not found" : String.join(", ",regNumbers));
    }
    @Override
    public void findSlotByRegistration(String color){

    }
    @Override
    public void findSlotsByColor(String color){

    }
}
