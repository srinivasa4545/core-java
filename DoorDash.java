class DoorDash {

    static int checkItem(String foodItem) {
        int price = 0;

        if ("Burger"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 150;
            return price;

        } else if ("Pizza"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 250;
            return price;

        } else if ("Sandwich"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 120;
            return price;

        } else if ("Pasta"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 180;
            return price;

        } else if ("Fries"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 90;
            return price;

        } else if ("Coke"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 50;
            return price;

        } else {
            System.out.println("No item found");
            return 0;
        }
    }

    static int checkItem(String foodItem, int price, int quantity) {
        int totalPrice = 0;

        if ("Burger"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Pizza"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Sandwich"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Pasta"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else {
            return 0;
        }
    }
}

