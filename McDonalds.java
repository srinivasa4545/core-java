class McDonalds {

    static int checkItem(String foodItem) {
        int price = 0;

        if ("Burger" ==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 120;
            return price;

        } else if ("French Fries"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 90;
            return price;

        } else if ("Pizza McPuff"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 60;
            return price;

        } else if ("Chicken Nuggets"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 150;
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

        } else if ("French Fries"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Pizza McPuff"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else {
            return 0;
        }
    }
}

