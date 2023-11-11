public class BookTest {
    public static void main(String[] args) {
        Book miki = new Book();
        miki.setPages(3);
        miki.setPages(-4);
        System.out.println(miki.getPages());
    }
}
