class Inshorts {

    String newsTitle;
    int newsId;
    boolean isTrending;
    int viewsCount;
    double rating;

    public Inshorts(String n1, int n2, boolean n3, int n4, double n5) {
        newsTitle = n1;
        newsId = n2;
        isTrending = n3;
        viewsCount = n4;
        rating = n5;
    }

    public void show() {
        System.out.println(newsTitle);
        System.out.println(newsId);
        System.out.println(isTrending);
        System.out.println(viewsCount);
        System.out.println(rating);
    }
}

