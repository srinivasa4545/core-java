class BazaarNow {

    static int checkItem(String itemName){
        int price = 0;

        if("Rice" == itemName){
            System.out.println("Item is: " + itemName);
            price = 60;
            return price;

        } else if("Wheat" == itemName){
            System.out.println("Item is: " + itemName);
            price = 50;
            return price;

        } else if("Sugar" == itemName){
            System.out.println("Item is: " + itemName);
            price = 45;
            return price;

        } else if("Milk" == itemName){
            System.out.println("Item is: " + itemName);
            price = 30;
            return price;

        } else if("Oil" == itemName){
            System.out.println("Item is: " + itemName);
            price = 120;
            return price;

        } else if("Soap" == itemName){
            System.out.println("Item is: " + itemName);
            price = 25;
            return price;

        } else if("Shampoo" == itemName){
            System.out.println("Item is: " + itemName);
            price = 10;
            return price;

        } else if("Salt" == itemName){
            System.out.println("Item is: " + itemName);
            price = 20;
            return price;

        } else if("Toothpaste" == itemName){
            System.out.println("Item is: " + itemName);
            price = 55;
            return price;

        } else if("Biscuits" == itemName){
            System.out.println("Item is: " + itemName);
            price = 20;
            return price;

        } else {
            System.out.println("No item found");
            return 0;
        }
    }

    static int checkItem(String itemName, int price, int quantity){
        int totalPrice = 0;

        if("Rice" == itemName){
            totalPrice = price * quantity;
            return totalPrice;

        } else if("Wheat" == itemName){
            totalPrice = price * quantity;
            return totalPrice;

        } else if("Sugar" == itemName){
            totalPrice = price * quantity;
            return totalPrice;

        } else if("Milk" == itemName){
            totalPrice = price * quantity;
            return totalPrice;

        } else {
            return 0;
        }
    }
}