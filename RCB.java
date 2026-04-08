class RCB {

    static void startMatch() {
        System.out.println("RCB Match Started");
        teamDetails("RCB Team");
    }

    static void teamDetails(String teamName) {
        System.out.println("Team Name: " + teamName);
        int runs = playMatch();
        System.out.println("Total Runs Scored: " + runs);
    }

    static int playMatch() {
        System.out.println("Playing Match");
        return 180;
    }
}

