public class BookTest {
    public static void main(String[] args) {
        Book one = new Book("Pan Tadeusz", "Mickiewicz");
        Book two = new Book("Dziady", "Mickiewicz");
        
        Ebook three = new Ebook("Pan Tadeusz", "Mickiewicz","123");
        three.setAuthor("123344");

        Audiobook four = new Audiobook("Pan Tadeusz", "Mickiewicz",14,15);
        System.out.println(four.display());
    }
    
}
