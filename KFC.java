class KFC {

    static int checkItem(String foodItem) {
        int price = 0;

        if ("Chicken Bucket"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 399;
            return price;

        } else if ("Zinger Burger"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 199;
            return price;

        } else if ("Hot Wings"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 249;
            return price;

        } else if ("Chicken Popcorn"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 179;
            return price;

        } else if ("French Fries"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 99;
            return price;

        } else if ("Pepsi"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 60;
            return price;

        } else {
            System.out.println("No item found");
            return 0;
        }
    }

    static int checkItem(String foodItem, int price, int quantity) {
        int totalPrice = 0;

        if ("Chicken Bucket"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Zinger Burger"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Hot Wings"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Chicken Popcorn"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else {
            return 0;
        }
    }
}

