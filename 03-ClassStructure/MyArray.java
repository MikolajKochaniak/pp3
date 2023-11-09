public class MyArray {
    int[] array;
    public static int even(int[] array){
        int counter = 0;
        for(int i = 0; i <= array.length -1 ;i++){
            if(array[i]%2==0){
                counter +=1;
                     }              
        }
        return counter;
    }
    public static int[] reverse(int[] array){
        int[] output_array = new int[array.length];
        int u = 0;
        for(int i = array.length -1 ; i == 0 ;i--){
            output_array[u] = array[i];
            u++;
        
    }
    return output_array;
}
    public static boolean compare(int[] array1, int[] array2){
        boolean tester = false;
        for(int i = 0; i <= array1.length -1;i++){
            if(array1[i]!=array2[i]){
                return tester;
            }
            else{
                tester = true;
                continue;
            }
        }
        return tester;
    }
    /*public static int different(int[] array1, int[] array2){
        int[] output_array;
        int l = 0;
        for(int i = 0; i <= array1.length -1;i++){
            for(int j = 0; j <= array2.length -1;j++){
                if(array1[i] != array2[j] && i ==j){
                    output_array[l]=array1[i];
                    l++;
                else if


                }
            }
        }
    }        podpunkt e        */

    public static boolean exist(int number, int[] array){
        boolean if_exist = false;
        for(int i = 0;i<array.length;i++){
            if(number == array[i]){
                if_exist = true;
            }
            else{
                continue;
            }
            }
        return if_exist;
        }

        public static int secondMax(int[]array){
            int max = array[0];
            int second_max;
            for(int i = 0;i<array.length;i++){
                if(array[i]>max){
                    second_max = max;
                    max = array[i];
                }
            }
            return second_max;
        }
    }

