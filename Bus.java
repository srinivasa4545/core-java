class Bus {

    public static void main(String[] args) {

        String busName;
        double ticketPrice;
        char busType;
        boolean isAC;
        int busNumber;

        busName = "Express Line";
        ticketPrice = 250.75;
        busType = 'A';
        isAC = true;
        busNumber = 501;

        System.out.println("Bus Name: " + busName);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Bus Type: " + busType);
        System.out.println("AC Bus: " + isAC);
        System.out.println("Bus Number: " + busNumber);

        busName = "City Rider";
        ticketPrice = 120.50;
        busType = 'B';
        isAC = false;
        busNumber = 502;

        System.out.println("---- After Changing Values ----");

        System.out.println("Bus Name: " + busName);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Bus Type: " + busType);
        System.out.println("AC Bus: " + isAC);
        System.out.println("Bus Number: " + busNumber);
    }
}