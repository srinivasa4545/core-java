class DominosRunner {
    public static void main(String[] args) {

        int price = 0;

        price = Dominos.checkItem("Veg Pizza");
        System.out.println("Price for one item: " + price);

        int totalPrice = Dominos.checkItem("Veg Pizza", price, 3);
        System.out.println("Total Price: " + totalPrice);
    }
}