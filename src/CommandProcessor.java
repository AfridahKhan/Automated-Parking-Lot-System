import java.util.HashMap;
import java.util.Map;

class CommandProcessor {
    private Map<String, Command> commands = new HashMap<>();
    private IParkingLot parkingLot;
    private IParkingQuery parkingQuery;

    public void setParkingLot(IParkingLot parkingLot) {
        this.parkingLot = parkingLot;
        this.parkingQuery = new ParkingQueryService(((ParkingLotManager) parkingLot).getOccupiedSlots());


        commands.put("park", new ParkingCommand(parkingLot));
        commands.put("leave", new LeaveCommand(parkingLot));
        
    }

    public CommandProcessor() {
        commands.put("create_parking_lot", new CreateParkingLotCommand(this));
        commands.put("exit", new ExitCommand());
    }

    public void processCommand(String commandInput) {
        String[] parts = commandInput.split(" ");
        String commandName = parts[0];
        String[] args = parts.length > 1 ? java.util.Arrays.copyOfRange(parts, 1, parts.length) : new String[0];

        Command command = commands.get(commandName);
        if (command != null) {
            command.execute(args);
        } else {
            System.out.println("Invalid command");
        }
    }
}

