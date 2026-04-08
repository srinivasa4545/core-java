class Bus {

    static void startBus() {
        System.out.println("Bus Started");
        pickPassengers("City Bus");
    }

    static void pickPassengers(String busName) {
        System.out.println("Bus Name: " + busName);
        int passengers = countPassengers();
        System.out.println("Total Passengers: " + passengers);
    }

    static int countPassengers() {
        System.out.println("Counting Passengers");
        return 45;
    }
}

