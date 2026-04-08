class CalendarApp {

    static void openApp() {
        System.out.println("Open Calendar App");
        addEvent("Meeting");
    }

    static void addEvent(String eventName) {
        System.out.println("Adding Event: " + eventName);
        int events = viewEvents();
        System.out.println("Total Events: " + events);
    }

    static int viewEvents() {
        System.out.println("Viewing All Events");
        return 8;
    }
}

