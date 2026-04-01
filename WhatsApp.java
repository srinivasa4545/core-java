class WhatsApp {

    String userName;
    int userId;
    boolean isOnline;
    int contactsCount;
    double dataBalance;

    public WhatsApp(String w1, int w2, boolean w3, int w4, double w5) {
        userName = w1;
        userId = w2;
        isOnline = w3;
        contactsCount = w4;
        dataBalance = w5;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(userId);
        System.out.println(isOnline);
        System.out.println(contactsCount);
        System.out.println(dataBalance);
    }
}

