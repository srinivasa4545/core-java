class Magicpin {


    static int checkItem(String foodItem) {
        int price = 0;

        if ("Burger"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 110;
            return price;

        } else if ("Pizza"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 220;
            return price;

        } else if ("Sandwich"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 90;
            return price;

        } else if ("Pav Bhaji"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 80;
            return price;

        } else if ("Fried Rice"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 100;
            return price;

        } else if ("Noodles"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 95;
            return price;

        } else if ("Cold Coffee"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 70;
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

        } else if ("Pav Bhaji"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else {
            return 0;
        }
    }
}
