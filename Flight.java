class Flight {

    static void startFlight() {
        System.out.println("Flight is Taking Off");
        checkPassengers("Air India");
    }

    static void checkPassengers(String flightName) {
        System.out.println("Flight Name: " + flightName);
        int passengers = countPassengers();
        System.out.println("Total Passengers: " + passengers);
    }

    static int countPassengers() {
        System.out.println("Counting Passengers");
        return 180;
    }
}

