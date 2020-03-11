class Book{
    String title;
    String author;
    String publisher;
    double price;
    int id;

    Book(int id,String title, String author, String publisher, int price){
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;

    }

    public String toString(){
        return "Title:"+title+"\nAuthor:"+author+"\nPublisher:"+publisher+"\nPrice:"+price;
    }
}