class FreeFire {

    static void startGame() {
        System.out.println("Free Fire Game Started");
        login("PlayerOne");
    }

    static void login(String userName) {
        System.out.println("Login with username: " + userName);
        int kills = playMatch();
        System.out.println("Total Kills: " + kills);
    }

    static int playMatch() {
        System.out.println("Playing Match");
        return 8;
    }
}