class MagicpinRunner {
    public static void main(String[] args) {

        int price = 0;

        price = Magicpin.checkItem("Pizza");
        System.out.println("Price for one item: " + price);

        int totalPrice = Magicpin.checkItem("Pizza", price, 3);
        System.out.println("Total Price: " + totalPrice);
    }
}