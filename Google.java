class Google {

    static void openApp() {
        System.out.println("Open Google App");
        login("Srinivasa");
    }

    static void login(String userName) {
        System.out.println("Login with Gmail: " + userName);
        int searches = viewSearchHistory();
        System.out.println("Total Searches: " + searches);
    }

    static int viewSearchHistory() {
        System.out.println("Viewing Search History");
        return 500;
    }
}

