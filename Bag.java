class Bag {

    static void openBag() {
        System.out.println("Bag is Opened");
        checkItems("School Bag");
    }

    static void checkItems(String bagName) {
        System.out.println("Bag Name: " + bagName);
        int items = viewItems();
        System.out.println("Total Items in Bag: " + items);
    }

    static int viewItems() {
        System.out.println("Viewing Items in Bag");
        return 10;
    }
}

