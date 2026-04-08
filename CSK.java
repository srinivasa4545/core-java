class CSK {

    static void startMatch() {
        System.out.println("CSK Match Started");
        teamDetails("Chennai Super Kings");
    }

    static void teamDetails(String teamName) {
        System.out.println("Team Name: " + teamName);
        int runs = playMatch();
        System.out.println("Total Runs Scored: " + runs);
    }

    static int playMatch() {
        System.out.println("Playing Match");
        return 195;
    }
}

