class PUBG {

    String playerName;
    String gun;
    int rank;

    
    public PUBG() {
    }

    public PUBG(String playerName, String gun, int rank) {
        this.playerName = playerName;
        this.gun = gun;
        this.rank = rank;
    }

    
    public void display() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Gun: " + gun);
        System.out.println("Rank: " + rank);
        System.out.println("----------------------");
    }
}

