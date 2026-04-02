class WikipediaRunner {
    public static void main(String[] args) {

        Wikipedia w1 = new Wikipedia("Java Programming", "Technology", 2500);
        w1.display();

        Wikipedia w2 = new Wikipedia("India", "Country", 5000);
        w2.display();

        Wikipedia w3 = new Wikipedia("Lion", "Animal", 1800);
        w3.display();

        Wikipedia w4 = new Wikipedia("Earth", "Planet", 3000);
        w4.display();

        Wikipedia w5 = new Wikipedia("Cricket", "Sport", 2200);
        w5.display();

        Wikipedia w6 = new Wikipedia("Computer", "Technology", 2700);
        w6.display();

        Wikipedia w7 = new Wikipedia("Taj Mahal", "History", 3200);
        w7.display();

    }
}