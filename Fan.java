class Fan {

    public static void main(String[] args) {

        String fanBrand;
        double price;
        char fanGrade;
        boolean isCeilingFan;
        int fanId;

        fanBrand = "Usha";
        price = 2500.50;
        fanGrade = 'A';
        isCeilingFan = true;
        fanId = 1301;

        System.out.println("Fan Brand: " + fanBrand);
        System.out.println("Price: " + price);
        System.out.println("Fan Grade: " + fanGrade);
        System.out.println("Ceiling Fan: " + isCeilingFan);
        System.out.println("Fan ID: " + fanId);

        fanBrand = "Bajaj";
        price = 1800.75;
        fanGrade = 'B';
        isCeilingFan = false;
        fanId = 1302;

        System.out.println("---- After Changing Values ----");

        System.out.println("Fan Brand: " + fanBrand);
        System.out.println("Price: " + price);
        System.out.println("Fan Grade: " + fanGrade);
        System.out.println("Ceiling Fan: " + isCeilingFan);
        System.out.println("Fan ID: " + fanId);
    }
}