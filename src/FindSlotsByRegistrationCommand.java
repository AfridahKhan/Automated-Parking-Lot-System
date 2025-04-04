class FindSlotsByRegistrationCommand implements Command {

        private IParkingQuery parkingQuery;

        public FindSlotsByRegistrationCommand(IParkingQuery parkingQuery) {
            this.parkingQuery = parkingQuery;
        }

        @Override
        public void execute(String[] args) {
            if (args.length == 1) {
                parkingQuery.findSlotByRegistration(args[0]);
            } else {
                System.out.println("Invalid command syntax");
            }
        }
    }

