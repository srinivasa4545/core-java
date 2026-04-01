class Snapchat {

    String userName;
    int userId;
    boolean isActive;
    int streakCount;
    double snapScore;

    public Snapchat(String s1, int s2, boolean s3, int s4, double s5) {
        userName = s1;
        userId = s2;
        isActive = s3;
        streakCount = s4;
        snapScore = s5;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(userId);
        System.out.println(isActive);
        System.out.println(streakCount);
        System.out.println(snapScore);
    }
}

