class Laptop {

    static void powerOn() {
        System.out.println("Laptop is Powering On");
        login("Srinivasa");
    }

    static void login(String userName) {
        System.out.println("Login with username: " + userName);
        int files = openDesktop();
        System.out.println("Total Files on Desktop: " + files);
    }

    static int openDesktop() {
        System.out.println("Opening Desktop");
        return 75;
    }
}

