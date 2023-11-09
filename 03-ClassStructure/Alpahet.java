public class Alpahet {
    public static boolean isAlphabet(String t){
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] arr_t = t.toCharArray();
        int friendly_int= 0;
        int[] indexes = new int[arr_t.length];

        
        
        for(int i = 0; i < arr_t.length; i++){
            for(int j = 0;j < alphabet.length;j++){
                if(arr_t[i]==alphabet[j]){
                    indexes[friendly_int]= j;
                    friendly_int++;
                }

            }
            
            
        }
        for(int k = 0; k<indexes.length - 1;k++){
            if(indexes[k]>indexes[k+1]){
                return false;
            }
        }
        return true;

        }
    }

