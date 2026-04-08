class Meesho {

    static void openApp() {
        System.out.println("Open Meesho App");
        login("Srinivasa");
    }

    static void login(String userName) {
        System.out.println("Login with username: " + userName);
        int orders = viewOrders();
        System.out.println("Total Orders: " + orders);
    }

    static int viewOrders() {
        System.out.println("Viewing Orders");
        return 15;
    }
}

