class Kabaddi {

    public static void main(String[] args) {

        String teamName;
        double points;
        char teamGrade;
        boolean isWinner;
        int matchId;

        teamName = "Tiger Team";
        points = 35.5;
        teamGrade = 'A';
        isWinner = true;
        matchId = 1101;

        System.out.println("Team Name: " + teamName);
        System.out.println("Points: " + points);
        System.out.println("Team Grade: " + teamGrade);
        System.out.println("Winner: " + isWinner);
        System.out.println("Match ID: " + matchId);

        teamName = "Lion Team";
        points = 28.0;
        teamGrade = 'B';
        isWinner = false;
        matchId = 1102;

        System.out.println("---- After Changing Values ----");

        System.out.println("Team Name: " + teamName);
        System.out.println("Points: " + points);
        System.out.println("Team Grade: " + teamGrade);
        System.out.println("Winner: " + isWinner);
        System.out.println("Match ID: " + matchId);
    }
}