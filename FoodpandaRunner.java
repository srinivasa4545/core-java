class FoodpandaRunner {
    public static void main(String[] args) {

        int price = 0;

        price = Foodpanda.checkItem("Biryani");
        System.out.println("Price for one plate: " + price);

        int totalPrice = Foodpanda.checkItem("Biryani", price, 3);
        System.out.println("Total Price: " + totalPrice);
    }
}