class JustEatRunner {
    public static void main(String[] args) {

        int price = 0;

        price = JustEat.checkItem("Chicken Biryani");
        System.out.println("Price for one plate: " + price);

        int totalPrice = JustEat.checkItem("Chicken Biryani", price, 2);
        System.out.println("Total Price: " + totalPrice);
    }
}