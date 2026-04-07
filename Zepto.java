class Zepto {

    static int checkItem(String foodItem) {
        int price = 0;

        if ("Milk"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 50;
            return price;

        } else if ("Bread"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 40;
            return price;

        } else if ("Eggs"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 70;
            return price;

        } else if ("Rice"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 120;
            return price;

        } else if ("Cooking Oil"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 150;
            return price;

        } else if ("Sugar"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 60;
            return price;

        } else if ("Tea Powder"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 90;
            return price;

        } else {
            System.out.println("No item found");
            return 0;
        }
    }

    static int checkItem(String foodItem, int price, int quantity) {
        int totalPrice = 0;

        if ("Milk"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Bread"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Eggs"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Rice"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else {
            return 0;
        }
    }
}

