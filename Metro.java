class Metro {

    static void startMetro() {
        System.out.println("Metro Started");
        checkRoute("City Metro");
    }

    static void checkRoute(String metroName) {
        System.out.println("Metro Name: " + metroName);
        int passengers = countPassengers();
        System.out.println("Total Passengers: " + passengers);
    }

    static int countPassengers() {
        System.out.println("Counting Passengers in Metro");
        return 250;
    }
}

