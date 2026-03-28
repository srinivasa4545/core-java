class Table {

    public static void main(String[] args) {

        String tableType;
        double price;
        char qualityGrade;
        boolean isWooden;
        int tableId;

        tableType = "Dining Table";
        price = 8500.50;
        qualityGrade = 'A';
        isWooden = true;
        tableId = 801;

        System.out.println("Table Type: " + tableType);
        System.out.println("Price: " + price);
        System.out.println("Quality Grade: " + qualityGrade);
        System.out.println("Wooden Table: " + isWooden);
        System.out.println("Table ID: " + tableId);

        tableType = "Study Table";
        price = 4500.75;
        qualityGrade = 'B';
        isWooden = false;
        tableId = 802;

        System.out.println("---- After Changing Values ----");

        System.out.println("Table Type: " + tableType);
        System.out.println("Price: " + price);
        System.out.println("Quality Grade: " + qualityGrade);
        System.out.println("Wooden Table: " + isWooden);
        System.out.println("Table ID: " + tableId);
    }
}