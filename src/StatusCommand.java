import java.util.List;

public class StatusCommand implements Command {
    private ParkingQueryService parkingQueryService;

    public StatusCommand(ParkingQueryService parkingQueryService) {
        this.parkingQueryService = parkingQueryService;
    }

    @Override
    public void execute(String[] args) {
        List<String> statusList = parkingQueryService.getStatus(); // ✅ Get data
        for (String line : statusList) {                   // ✅ Print in UI layer
            System.out.println(line);
        }
    }
    }


