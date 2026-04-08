class Blinkit {

    static void openApp() {
        System.out.println("Open Blinkit App");
        login("Srinivasa");
    }

    static void login(String userName) {
        System.out.println("Login with username: " + userName);
        int items = viewCart();
        System.out.println("Total Items in Cart: " + items);
    }

    static int viewCart() {
        System.out.println("Viewing Cart");
        return 12;
    }
}

