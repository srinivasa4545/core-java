class MeeshoRunner {
    public static void main(String[] args) {

        Meesho m1 = new Meesho("Saree", 601, true, 25, 1200.0);
        m1.show();

        Meesho m2 = new Meesho("Kurti", 602, true, 30, 800.0);
        m2.show();

        Meesho m3 = new Meesho("Handbag", 603, false, 10, 1500.0);
        m3.show();

        Meesho m4 = new Meesho("Jewellery Set", 604, true, 18, 500.0);
        m4.show();

        Meesho m5 = new Meesho("Slippers", 605, false, 12, 300.0);
        m5.show();

        Meesho m6 = new Meesho("Bedsheet", 606, true, 20, 900.0);
        m6.show();

        Meesho m7 = new Meesho("Watch", 607, true, 15, 700.0);
        m7.show();
    }
}