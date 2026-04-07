class JustEat {

    static int checkItem(String foodItem) {
        int price = 0;

        if ("Veg Biryani"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 120;
            return price;

        } else if ("Chicken Biryani"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 180;
            return price;

        } else if ("Paneer Butter Masala"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 150;
            return price;

        } else if ("Butter Naan"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 40;
            return price;

        } else if ("Fried Rice"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 100;
            return price;

        } else if ("Noodles"==(foodItem)) {
            System.out.println("Food Item is: " + foodItem);
            price = 90;
            return price;

        } else if ("Ice Cream"==(foodItem)) {
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

        if ("Veg Biryani"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Chicken Biryani"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Paneer Butter Masala"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else if ("Butter Naan"==(foodItem)) {
            totalPrice = price * quantity;
            return totalPrice;

        } else {
            return 0;
        }
    }
}

