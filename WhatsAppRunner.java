class WhatsAppRunner {
    public static void main(String[] args) {

        WhatsApp w1 = new WhatsApp("Rahul", 301, true, 150, 1.5);
        w1.show();

        WhatsApp w2 = new WhatsApp("Anita", 302, false, 200, 2.0);
        w2.show();

        WhatsApp w3 = new WhatsApp("Kiran", 303, true, 120, 0.5);
        w3.show();

        WhatsApp w4 = new WhatsApp("Sneha", 304, false, 300, 3.0);
        w4.show();

        WhatsApp w5 = new WhatsApp("Arjun", 305, true, 180, 1.2);
        w5.show();

        WhatsApp w6 = new WhatsApp("Meena", 306, true, 220, 2.5);
        w6.show();

        WhatsApp w7 = new WhatsApp("Vikram", 307, false, 140, 0.8);
        w7.show();
    }
}