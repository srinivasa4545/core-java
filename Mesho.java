class Meesho {

    String productName;
    int productId;
    boolean isAvailable;
    int quantity;
    double price;

    public Meesho(String m1, int m2, boolean m3, int m4, double m5) {
        productName = m1;
        productId = m2;
        isAvailable = m3;
        quantity = m4;
        price = m5;
    }

    public void show() {
        System.out.println(productName);
        System.out.println(productId);
        System.out.println(isAvailable);
        System.out.println(quantity);
        System.out.println(price);
    }
}  