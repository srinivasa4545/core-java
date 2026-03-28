class Cricket {

    public static void main(String[] args) {

        String teamName;
        double runRate;
        char teamGrade;
        boolean isWinner;
        int matchId;

        teamName = "Warriors";
        runRate = 6.75;
        teamGrade = 'A';
        isWinner = true;
        matchId = 1001;

        System.out.println("Team Name: " + teamName);
        System.out.println("Run Rate: " + runRate);
        System.out.println("Team Grade: " + teamGrade);
        System.out.println("Winner: " + isWinner);
        System.out.println("Match ID: " + matchId);

        teamName = "Strikers";
        runRate = 5.80;
        teamGrade = 'B';
        isWinner = false;
        matchId = 1002;

        System.out.println("---- After Changing Values ----");

        System.out.println("Team Name: " + teamName);
        System.out.println("Run Rate: " + runRate);
        System.out.println("Team Grade: " + teamGrade);
        System.out.println("Winner: " + isWinner);
        System.out.println("Match ID: " + matchId);
    }
}