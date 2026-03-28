class Laptop {

    public static void main(String[] args) {

        String laptopName;
        double price;
        char laptopGrade;
        boolean isTouchScreen;
        int laptopId;

        laptopName = "Dell Inspiron";
        price = 55000.50;
        laptopGrade = 'A';
        isTouchScreen = false;
        laptopId = 1201;

        System.out.println("Laptop Name: " + laptopName);
        System.out.println("Price: " + price);
        System.out.println("Laptop Grade: " + laptopGrade);
        System.out.println("Touch Screen: " + isTouchScreen);
        System.out.println("Laptop ID: " + laptopId);

        laptopName = "HP Pavilion";
        price = 62000.75;
        laptopGrade = 'B';
        isTouchScreen = true;
        laptopId = 1202;

        System.out.println("---- After Changing Values ----");

        System.out.println("Laptop Name: " + laptopName);
        System.out.println("Price: " + price);
        System.out.println("Laptop Grade: " + laptopGrade);
        System.out.println("Touch Screen: " + isTouchScreen);
        System.out.println("Laptop ID: " + laptopId);
    }
}