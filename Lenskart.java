class Lenskart {

    String productName;
    int orderId;
    boolean isDelivered;
    int quantity;

    
    public Lenskart() {
        this("Eyeglasses", 301, true);
        System.out.println("Details 1st");
    }

    public Lenskart(String productName) {
        System.out.println("Product Name: " + productName);
        System.out.println("Details 2nd");
    }

    public Lenskart(String productName, int orderId) {
        System.out.println("Product Name: " + productName);
        System.out.println("Order ID: " + orderId);
        System.out.println("Details 3rd");
    }

    public Lenskart(String productName, int orderId, boolean isDelivered) {
        System.out.println("Product Name: " + productName);
        System.out.println("Order ID: " + orderId);
        System.out.println("Delivered: " + isDelivered);
        System.out.println("Details 4th");
    }

    public Lenskart(String productName, int orderId, boolean isDelivered, int quantity) {
        System.out.println("Product Name: " + productName);
        System.out.println("Order ID: " + orderId);
        System.out.println("Delivered: " + isDelivered);
        System.out.println("Quantity: " + quantity);
        System.out.println("Details 5th");
    }
}