class CSK {

    String playerName;
    String role;
    int matches;

    
    public CSK() {
    }

    
    public CSK(String playerName, String role, int matches) {
        this.playerName = playerName;
        this.role = role;
        this.matches = matches;
    }

    
    public void display() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Role: " + role);
        System.out.println("Matches: " + matches);
        System.out.println("----------------------");
    }
}


