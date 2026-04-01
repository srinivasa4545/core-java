class Facebook {

    String userName;
    int userId;
    boolean isActive;
    int friendsCount;
    double accountBalance;

    public Facebook(String u1, int u2, boolean u3, int u4, double u5) {
        userName = u1;
        userId = u2;
        isActive = u3;
        friendsCount = u4;
        accountBalance = u5;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(userId);
        System.out.println(isActive);
        System.out.println(friendsCount);
        System.out.println(accountBalance);
    }
}

