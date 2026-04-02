class FreeFire {

    String playerName;
    String weapon;
    int level;

    
    public FreeFire() {
    }

    public FreeFire(String playerName, String weapon, int level) {
        this.playerName = playerName;
        this.weapon = weapon;
        this.level = level;
    }

    public void display() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Weapon: " + weapon);
        System.out.println("Level: " + level);
        System.out.println("----------------------");
    }
}

