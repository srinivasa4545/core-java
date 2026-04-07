class KFCRunner {
    public static void main(String[] args) {

        int price = 0;

        price = KFC.checkItem("Zinger Burger");
        System.out.println("Price for one item: " + price);

        int totalPrice = KFC.checkItem("Zinger Burger", price, 4);
        System.out.println("Total Price: " + totalPrice);
    }
}