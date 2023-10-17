public class bookTest {
    public static void main(String[] args) {
        Book Dziady = new Book();
        Book Lalka = new Book();
        Dziady.autor = "Adam Mickiewicz";
        Lalka.autor = "Bolesław Prus";
        Dziady.nazwa = "Dziady";
        Lalka.nazwa = "Lalka";
        Lalka.rokWydania = 1889;
        Dziady.rokWydania = 1822;
        Dziady.otworz();
        Lalka.otworz();
        Dziady.zamknij();
        Lalka.zamknij();
    }

}
