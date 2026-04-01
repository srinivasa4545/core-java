class Truecaller {

    String userName;
    int phoneNumberId;
    boolean isSpam;
    int contactsSaved;
    double rating;

    public Truecaller(String t1, int t2, boolean t3, int t4, double t5) {
        userName = t1;
        phoneNumberId = t2;
        isSpam = t3;
        contactsSaved = t4;
        rating = t5;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(phoneNumberId);
        System.out.println(isSpam);
        System.out.println(contactsSaved);
        System.out.println(rating);
    }
}

