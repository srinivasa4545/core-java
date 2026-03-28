class Supermarket{

    public static void main(String[] args) {

        String marketName;
        double dailyIncome;
        char marketGrade;
        boolean isOpen;
        int marketId;

        marketName = "Fresh Mart";
        dailyIncome = 25000.75;
        marketGrade = 'A';
        isOpen = true;
        marketId = 701;

        System.out.println("Supermarket Name: " + marketName);
        System.out.println("Daily Income: " + dailyIncome);
        System.out.println("Market Grade: " + marketGrade);
        System.out.println("Open Status: " + isOpen);
        System.out.println("Market ID: " + marketId);

        marketName = "City Supermarket";
        dailyIncome = 18000.50;
        marketGrade = 'B';
        isOpen = false;
        marketId = 702;

        System.out.println("---- After Changing Values ----");

        System.out.println("Supermarket Name: " + marketName);
        System.out.println("Daily Income: " + dailyIncome);
        System.out.println("Market Grade: " + marketGrade);
        System.out.println("Open Status: " + isOpen);
        System.out.println("Market ID: " + marketId);
    }
}