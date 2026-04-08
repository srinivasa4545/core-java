class WhatsApp {

    static void openApp() {
        System.out.println("Open WhatsApp App");
        login("Srinivasa");
    }

    static void login(String userName) {
        System.out.println("Login with username: " + userName);
        int messages = viewChats();
        System.out.println("Total Messages: " + messages);
    }

    static int viewChats() {
        System.out.println("Viewing Chats");
        return 250;
    }
}

