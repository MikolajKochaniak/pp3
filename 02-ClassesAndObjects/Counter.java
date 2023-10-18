public class Counter {
    int counter = 0;
    void inc_by_one(){
counter++;

    }
    void dec_by_one(){

counter--;        
    }
    void inc_by_ten(){

counter+=10;       
    }
    void dec_by_ten(){

counter -=10;       
    }
    void reset(){
        counter = 0;
        
    }
    void show(){
    System.out.println(counter);
    }
}
