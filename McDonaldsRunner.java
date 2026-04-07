class McDonaldsRunner {
    public static void main(String[] args) {

        int price = 0;

        price = McDonalds.checkItem("Burger");
        System.out.println("Price for one item: " + price);

        int totalPrice = McDonalds.checkItem("Burger", price, 5);
        System.out.println("Total Price: " + totalPrice);
    }
}