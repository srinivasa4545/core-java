class InshortsRunner {
    public static void main(String[] args) {

        Inshorts n1 = new Inshorts("Election News", 801, true, 10000, 4.5);
        n1.show();

        Inshorts n2 = new Inshorts("Sports Update", 802, true, 8000, 4.2);
        n2.show();

        Inshorts n3 = new Inshorts("Tech Launch", 803, false, 5000, 4.0);
        n3.show();

        Inshorts n4 = new Inshorts("Movie Release", 804, true, 12000, 4.8);
        n4.show();

        Inshorts n5 = new Inshorts("Weather Report", 805, false, 3000, 3.8);
        n5.show();

        Inshorts n6 = new Inshorts("Business News", 806, true, 7000, 4.3);
        n6.show();

        Inshorts n7 = new Inshorts("Health Tips", 807, true, 6000, 4.6);
        n7.show();
    }
}