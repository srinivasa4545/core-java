class SRH {

    String playerName;
    String role;
    int wickets;

    public SRH() {
    }

    
    public SRH(String playerName, String role, int wickets) {
        this.playerName = playerName;
        this.role = role;
        this.wickets = wickets;
    }

    public void display() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Role: " + role);
        System.out.println("Wickets: " + wickets);
        System.out.println("----------------------");
    }
}

c