class Car{

    public static void main(String[] args) {

        String carName;
        double price;
        char modelGrade;
        boolean isElectric;
        int carId;

        carName = "Honda City";
        price = 1200000.50;
        modelGrade = 'A';
        isElectric = false;
        carId = 101;

        System.out.println("Car Name: " + carName);
        System.out.println("Price: " + price);
        System.out.println("Model Grade: " + modelGrade);
        System.out.println("Electric Car: " + isElectric);
        System.out.println("Car ID: " + carId);

        carName = "Tata Nexon EV";
        price = 1500000.75;
        modelGrade = 'B';
        isElectric = true;
        carId = 102;

        System.out.println("---- After Changing Values ----");

        System.out.println("Car Name: " + carName);
        System.out.println("Price: " + price);
        System.out.println("Model Grade: " + modelGrade);
        System.out.println("Electric Car: " + isElectric);
        System.out.println("Car ID: " + carId);
    }
}