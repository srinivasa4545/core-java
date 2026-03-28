class House{

    public static void main(String[] args) {

        String houseType;
        double price;
        char houseGrade;
        boolean isOwned;
        int houseId;

        houseType = "Independent House";
        price = 2500000.50;
        houseGrade = 'A';
        isOwned = true;
        houseId = 901;

        System.out.println("House Type: " + houseType);
        System.out.println("Price: " + price);
        System.out.println("House Grade: " + houseGrade);
        System.out.println("Owned House: " + isOwned);
        System.out.println("House ID: " + houseId);

        houseType = "Apartment";
        price = 1800000.75;
        houseGrade = 'B';
        isOwned = false;
        houseId = 902;

        System.out.println("---- After Changing Values ----");

        System.out.println("House Type: " + houseType);
        System.out.println("Price: " + price);
        System.out.println("House Grade: " + houseGrade);
        System.out.println("Owned House: " + isOwned);
        System.out.println("House ID: " + houseId);
    }
}