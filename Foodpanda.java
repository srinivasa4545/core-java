class Foodpanda {

    static int checkItem(String foodItem) {
        int price = 0;

        if ("Veg Meals"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 120;
            return price;

        } else if ("Chicken Meals"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 180;
            return price;

        } else if ("Biryani"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 150;
            return price;

        } else if ("Fried Rice"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 100;
            return price;

        } else if ("Noodles"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 90;
            return price;

        } else if ("Manchurian"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 110;
            return price;

        } else if ("Cool Drink"==(foodItem)) {
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

        if ("Veg Meals"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Chicken Meals"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Biryani"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Fried Rice"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else {
            return 0;
        }
    }
}

