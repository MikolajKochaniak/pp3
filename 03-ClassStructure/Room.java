public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;
    int[] storage;
    Room(int number){
        this.number = number;
    }
    Room(int number,int beds){
        this.number = number;
        this.beds = beds;
    }
    void checkin(String guestName){
        if(!(occupied)){
            occupied = true;
            this.guestName = guestName;
        }
        else{
            System.out.println("Room is occupied");
        }
    }
    void checkout(){
        if(occupied){
            occupied = false;
        }
        else{
            System.out.println("This room wasnt occupied");
        }
    }
    boolean isOccupied(){
        return occupied;
    }
    String displayStatus(){
        return "Number : " + number + "Beds : " + beds + "occupied" + occupied + "name"+ guestName;
    }
    
}
