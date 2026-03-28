class India {

    public static void main(String[] args) {

        String countryName;
        double populationInCrores;
        char countryGrade;
        boolean isDevelopingCountry;
        int countryCode;

        countryName = "India";
        populationInCrores = 142.0;
        countryGrade = 'A';
        isDevelopingCountry = true;
        countryCode = 91;

        System.out.println("Country Name: " + countryName);
        System.out.println("Population (Crores): " + populationInCrores);
        System.out.println("Country Grade: " + countryGrade);
        System.out.println("Developing Country: " + isDevelopingCountry);
        System.out.println("Country Code: " + countryCode);

        countryName = "Bharat";
        populationInCrores = 140.5;
        countryGrade = 'B';
        isDevelopingCountry = true;
        countryCode = 92;

        System.out.println("---- After Changing Values ----");

        System.out.println("Country Name: " + countryName);
        System.out.println("Population (Crores): " + populationInCrores);
        System.out.println("Country Grade: " + countryGrade);
        System.out.println("Developing Country: " + isDevelopingCountry);
        System.out.println("Country Code: " + countryCode);
    }
}