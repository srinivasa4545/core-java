class Bike {

    public static void main(String[] args) {

        String bikeName;
        double price;
        char bikeGrade;
        boolean isElectric;
        int bikeId;

        bikeName = "Pulsar";
        price = 95000.50;
        bikeGrade = 'A';
        isElectric = false;
        bikeId = 301;

        System.out.println("Bike Name: " + bikeName);
        System.out.println("Price: " + price);
        System.out.println("Bike Grade: " + bikeGrade);
        System.out.println("Electric Bike: " + isElectric);
        System.out.println("Bike ID: " + bikeId);

        bikeName = "Activa Electric";
        price = 120000.75;
        bikeGrade = 'B';
        isElectric = true;
        bikeId = 302;

        System.out.println("---- After Changing Values ----");

        System.out.println("Bike Name: " + bikeName);
        System.out.println("Price: " + price);
        System.out.println("Bike Grade: " + bikeGrade);
        System.out.println("Electric Bike: " + isElectric);
        System.out.println("Bike ID: " + bikeId);
    }
}