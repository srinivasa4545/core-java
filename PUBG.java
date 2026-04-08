class PUBG {

    static void startGame() {
        System.out.println("PUBG Game Started");
        login("PlayerOne");
    }

    static void login(String userName) {
        System.out.println("Login with username: " + userName);
        int kills = playMatch();
        System.out.println("Total Kills: " + kills);
    }

    static int playMatch() {
        System.out.println("Playing PUBG Match");
        return 10;
    }
}

