class EastSure {

    static int checkItem(String foodItem) {
        int price = 0;

        if ("Veg Biryani"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 130;
            return price;

        } else if ("Chicken Curry"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 170;
            return price;

        } else if ("Fish Fry"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 140;
            return price;

        } else if ("Egg Masala"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 90;
            return price;

        } else if ("Paneer Curry"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 150;
            return price;

        } else if ("Roti"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 20;
            return price;

        } else if ("Dosa"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 80;
            return price;

        } else {
            System.out.println("No item found");
            return 0;
        }
    }

    static int checkItem(String foodItem, int price, int quantity) {
        int totalPrice = 0;

        if ("Veg Biryani"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Chicken Curry"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Fish Fry"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Egg Masala"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else {
            return 0;
        }
    }
}

