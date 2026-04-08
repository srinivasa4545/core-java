class Train {

    static void startTrain() {
        System.out.println("Train Started");
        checkDetails("Express Train");
    }

    static void checkDetails(String trainName) {
        System.out.println("Train Name: " + trainName);
        int passengers = countPassengers();
        System.out.println("Total Passengers: " + passengers);
    }

    static int countPassengers() {
        System.out.println("Counting Passengers");
        return 300;
    }
}

