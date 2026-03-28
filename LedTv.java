class LedTv {

    public static void main(String[] args) {

        String tvBrand;
        double price;
        char tvGrade;
        boolean isSmartTv;
        int tvId;

        tvBrand = "Samsung LED";
        price = 35000.50;
        tvGrade = 'A';
        isSmartTv = true;
        tvId = 1401;

        System.out.println("TV Brand: " + tvBrand);
        System.out.println("Price: " + price);
        System.out.println("TV Grade: " + tvGrade);
        System.out.println("Smart TV: " + isSmartTv);
        System.out.println("TV ID: " + tvId);

        tvBrand = "LG LED";
        price = 28000.75;
        tvGrade = 'B';
        isSmartTv = false;
        tvId = 1402;

        System.out.println("---- After Changing Values ----");

        System.out.println("TV Brand: " + tvBrand);
        System.out.println("Price: " + price);
        System.out.println("TV Grade: " + tvGrade);
        System.out.println("Smart TV: " + isSmartTv);
        System.out.println("TV ID: " + tvId);
    }
}