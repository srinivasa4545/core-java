class BusSimulator {

    String busName;
    String route;
    int ticketPrice;

    public BusSimulator() {
    }

    public BusSimulator(String busName, String route, int ticketPrice) {
        this.busName = busName;
        this.route = route;
        this.ticketPrice = ticketPrice;
    }

   
    public void display() {
        System.out.println("Bus Name: " + busName);
        System.out.println("Route: " + route);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("----------------------");
    }
}

