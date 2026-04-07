class EastSureRunner {
    public static void main(String[] args) {

        int price = 0;

        price = EastSure.checkItem("Fish Fry");
        System.out.println("Price for one plate: " + price);

        int totalPrice = EastSure.checkItem("Fish Fry", price, 4);
        System.out.println("Total Price: " + totalPrice);
    }
}