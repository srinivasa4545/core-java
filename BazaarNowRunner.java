class BazaarNowRunner {
    public static void main(String[] args){

        int price = 0;

        price = BazaarNow.checkItem("Rice");
        System.out.println("Price for one item: " + price);

        int totalPrice = BazaarNow.checkItem("Rice", price, 10);
        System.out.println("Total Price: " + totalPrice);
    }
}