import java.util.ArrayList;
public class Library{
    static ArrayList<Book> collection = new ArrayList<Book>();
    

    public static void main(String[] args) {
        Book one = new Book("Pan Tadeusz", "Mickiewicz");
        Book two = new Book("Dziady", "Mickiewicz");
        Ebook three = new Ebook("Pan Tadeusz", "Mickiewicz","123");
    
        collection.add(one);
        collection.add(two);
        collection.add(three);

        for(Book i: collection){
            i.display();
        }
    }
}
