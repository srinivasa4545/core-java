class Dominos {

    static int checkItem(String foodItem) {
        int price = 0;

        if ("Veg Pizza"==(foodItem)) {
            System.out.println("Food Item: " + foodItem);
            price = 200;
            return price;

        } else if ("Chicken Pizza"==(foodItem)) {
            System.out.println("Food Item: " + foodItem);
            price = 300;
            return price;

        } else if ("Paneer Pizza"==(foodItem)) {
            System.out.println("Food Item: " + foodItem);
            price = 250;
            return price;

        } else if ("Garlic Bread"==(foodItem)) {
            System.out.println("Food Item: " + foodItem);
            price = 120;
            return price;

        } else if ("Burger"==(foodItem)) {
            System.out.println("Food Item: " + foodItem);
            price = 150;
            return price;

        } else if ("French Fries"==(foodItem)) {
            System.out.println("Food Item: " + foodItem);
            price = 100;
            return price;

        } else if ("Coke"==(foodItem)) {
            System.out.println("Food Item: " + foodItem);
            price = 60;
            return price;

        } else {
            System.out.println("No item found");
            return 0;
        }
    }

    
    static int checkItem(String foodItem, int price, int noItems) {
        int totalPrice = 0;

        if ("Veg Pizza"==(foodItem)) {
            totalPrice = price * noItems;
            return totalPrice;

        } else if ("Chicken Pizza"==(foodItem)) {
            totalPrice = price * noItems;
            return totalPrice;

        } else if ("Paneer Pizza"==(foodItem)) {
            totalPrice = price * noItems;
            return totalPrice;

        } else {
            return 0;
        }
    }
}

