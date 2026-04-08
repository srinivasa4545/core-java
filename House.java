class House {

    static void enterHouse() {
        System.out.println("Entering the House");
        openDoor("Main Door");
    }

    static void openDoor(String doorName) {
        System.out.println("Opening: " + doorName);
        int rooms = viewRooms();
        System.out.println("Total Rooms in House: " + rooms);
    }

    static int viewRooms() {
        System.out.println("Viewing Rooms");
        return 5;
    }
}

