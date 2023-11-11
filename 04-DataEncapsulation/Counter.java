public class Counter {
    int counter = 0;
    void increase(){
        counter++;
    }
    void decrease(){
        counter--;
    }
    void increase(int n){
        counter+=n;
    }
    void decrease(int n){
        counter-=n;
    }
    int value(){
        return counter;
    }
}
