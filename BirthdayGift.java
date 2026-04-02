class BirthdayGift {

    String giftName;
    String personName;
    int price;

    
    public BirthdayGift() {
    }

    
    public BirthdayGift(String giftName, String personName, int price) {
        this.giftName = giftName;
        this.personName = personName;
        this.price = price;
    }

    
    public void display() {
        System.out.println("Gift Name: " + giftName);
        System.out.println("Given To: " + personName);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}

c