class Wikipedia {

    String title;
    String category;
    int wordCount;

    public Wikipedia() {
    }

    
    public Wikipedia(String title, String category, int wordCount) {
        this.title = title;
        this.category = category;
        this.wordCount = wordCount;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Word Count: " + wordCount);
        System.out.println("----------------------");
    }
}

