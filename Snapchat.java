class Snapchat {

    static void openApp() {
        System.out.println("Open Snapchat App");
        login("Srinivasa");
    }

    static void login(String userName) {
        System.out.println("Login with username: " + userName);
        int snaps = viewSnaps();
        System.out.println("Total Snaps: " + snaps);
    }

    static int viewSnaps() {
        System.out.println("Viewing Snaps");
        return 300;
    }
}

