class MI {

    String playerName;
    String role;
    int runs;

    public MI() {
    }

    public MI(String playerName, String role, int runs) {
        this.playerName = playerName;
        this.role = role;
        this.runs = runs;
    }

    public void display() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Role: " + role);
        System.out.println("Runs: " + runs);
        System.out.println("----------------------");
    }
}