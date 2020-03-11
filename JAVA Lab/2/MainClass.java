import java.util.*;

class SortByPrice implements Comparator<Book>{
    public int compare(Book a, Book b){
        return (int)(a.price - b.price);
    }
}
public class MainClass{    
    public static void main(String args[]){
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book(1,"The XYZ of ABC","ABC","XYZ",210));
        books.add(new Book(2,"The UVW on ABC","ABC","UVW",215));
        books.add(new Book(3,"The XYZ of UVW","UVW","XYZ",201));
        books.add(new Book(4,"The UVW on XYZ","XYZ","UVW",205));

        ArrayList<Book> copyBooks = new ArrayList<Book>();
        copyBooks = books;
        Collections.sort(copyBooks, new SortByPrice()); 

        System.out.println("Enter an author name");
        Scanner sc = new Scanner(System.in);
        String authsrc = sc.next();
        System.out.println("Books:");
        for(Book b:books){
            if(b.author.equalsIgnoreCase(authsrc)){
                System.out.println(b);
            }
        }

        ArrayList<Book> prBook = new ArrayList<Book>();
        System.out.println("Enter the threshold price");
        double price = sc.nextDouble();
        System.out.println("Books above the price:");
        for(Book b:books){
            if(b.price>=price){
                prBook.add(b);
                System.out.println(b);
            }
        }
        System.out.println("Enter a title to search for");
        String title = sc.next();

        for(Book b:books){
            if(b.title.contains(title)){
                System.out.println(b);
            }
        }

        System.out.println("Enter the publisher to search for his/her books");
        String publisher = sc.next();
        System.out.println("Books of "+publisher+":");
        for(Book b:books){
            if(b.publisher.equalsIgnoreCase(publisher)){
                System.out.println(b);
            }
        }
        System.out.println("Enter the title of a book whose publisher details is to be updated");
        Scanner sc1 = new Scanner(System.in);
        title = sc1.nextLine();
        for(Book b:books){
            if(b.title.equalsIgnoreCase(title)){
                System.out.println("Enter the new publisher name");
                publisher = sc1.next();
                System.out.println("Publisher details updated. Book details:");
                b.publisher = publisher;
                System.out.println(b);
            }
        }
    }
}
