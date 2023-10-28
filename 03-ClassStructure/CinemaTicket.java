public class CinemaTicket {
    static String cinemaName = "Multikino";
    String film_title;
    int row;
    int seat;
    int price;
    CinemaTicket(String nazwa_filmu, int rzad, int siedzenie){

        if(rzad <= 2){
            System.out.println(nazwa_filmu + "\n" + rzad + "\n" + siedzenie + "\n" + "10 PLN");
            price = 10;
        }
        else if(rzad > 2){
            System.out.println(nazwa_filmu + "\n" + rzad + "\n" + siedzenie + "\n" + "25 PLN");
            price = 25;
        }
        film_title = nazwa_filmu;
        row = rzad;
        seat = siedzenie;

    }

    public String toString(){
    return cinemaName + "\n" + film_title + "\n" + row + "\n" + seat + "\n" + price; 
    
    }
    
    
    
}
