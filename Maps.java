class Maps {

    static void openApp() {
        System.out.println("Open Maps App");
        searchLocation("Bangalore");
    }

    static void searchLocation(String place) {
        System.out.println("Searching Location: " + place);
        int routes = viewRoutes();
        System.out.println("Total Routes Found: " + routes);
    }

    static int viewRoutes() {
        System.out.println("Viewing Available Routes");
        return 5;
    }
}

