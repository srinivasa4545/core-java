class ZeptoRunner {
    public static void main(String[] args) {

        int price = 0;

        price = Zepto.checkItem("Milk");
        System.out.println("Price for one item: " + price);

        int totalPrice = Zepto.checkItem("Milk", price, 5);
        System.out.println("Total Price: " + totalPrice);
    }
}