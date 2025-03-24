class StatusCommand implements Command {
    private ParkingQueryService parkingQueryService;

    public StatusCommand(ParkingQueryService parkingQueryService) {
        this.parkingQueryService = parkingQueryService;
    }

    @Override
    public void execute(String[] args) {
        parkingQueryService.status();
    }
}

