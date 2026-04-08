class Phone {

    static void powerOn() {
        System.out.println("Phone is Powering On");
        unlock("1234");
    }

    static void unlock(String pin) {
        System.out.println("Unlocking phone with PIN: " + pin);
        int contacts = viewContacts();
        System.out.println("Total Contacts: " + contacts);
    }

    static int viewContacts() {
        System.out.println("Viewing Contacts");
        return 200;
    }
}
