import java.util.List;

public class StatusCommand implements Command {
    private ParkingStatusService parkingStatusService;

    public StatusCommand(ParkingStatusService parkingStatusService) {
        this.parkingStatusService = parkingStatusService;
    }

    @Override
    public void execute(String[] args) {
        List<String> statusList = parkingStatusService.getStatus(); // ✅ Get data
        for (String line : statusList) {                   // ✅ Print in UI layer
            System.out.println(line);
        }
    }
    }


