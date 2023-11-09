public class Calculator  {
    int h;
    int z;
    
    public static int valueOfRange(int h, int z){
        int counter = 0;
        for(int i = h; i<= z ;i++){
            if(i!=z){
                counter += i;
            }
            else if (i ==z){
                counter +=i;
                break;
        }
        }
        return counter;

    }
    public static int nuOfNumbers(int h, int z){
        int counter = 0;
        for(int i = h; i<= z ;i++){
            if(i!=z){
                counter += 1;
            }
            else if (i ==z){
                counter +=1;
                break;
        }
        }
        return counter;

    
    }
    public static double aritmetic(double h, double z){
        double counter = 0;
        double counter_2 = 0;
        for(double i = h; i<= z ;i++){
            if(i!=z){
                counter += i;
                counter_2+=1;
            }
            else if (i ==z){
                counter +=i;
                counter_2+=1;
                break;
        }
        }
        return counter/counter_2;


    
    }
}
