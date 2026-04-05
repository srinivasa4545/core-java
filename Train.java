class Train {

    String trainName;
    int trainNumber;
    boolean isOnTime;
    int coaches;

    
    public Train() {
        this("Express", 12345, true);
        System.out.println("Details 1st");
    }

   
    public Train(String trainName) {
        System.out.println("Train Name: " + trainName);
        System.out.println("Details 2nd");
    }

    
    public Train(String trainName, int trainNumber) {
        System.out.println("Train Name: " + trainName);
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Details 3rd");
    }

    
    public Train(String trainName, int trainNumber, boolean isOnTime) {
        System.out.println("Train Name: " + trainName);
        System.out.println("Train Number: " + trainNumber);
        System.out.println("On Time: " + isOnTime);
        System.out.println("Details 4th");
    }

    
    public Train(String trainName, int trainNumber, boolean isOnTime, int coaches) {
        System.out.println("Train Name: " + trainName);
        System.out.println("Train Number: " + trainNumber);
        System.out.println("On Time: " + isOnTime);
        System.out.println("Coaches: " + coaches);
        System.out.println("Details 5th");
    }
}