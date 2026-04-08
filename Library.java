class Library {

    static void openLibrary() {
        System.out.println("Library is Open");
        issueBook("Java Programming");
    }

    static void issueBook(String bookName) {
        System.out.println("Issuing Book: " + bookName);
        int books = viewBooks();
        System.out.println("Total Books Available: " + books);
    }

    static int viewBooks() {
        System.out.println("Viewing Books in Library");
        return 500;
    }
}
