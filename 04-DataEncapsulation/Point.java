public class Point {
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    boolean isX(){
        if(y ==0){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isY(){
        if(x ==0){
            return true;
        }
        else{
            return false;
        }
}
public String toString(){
    return "P(" + x + "," + y + ")";
}
}
