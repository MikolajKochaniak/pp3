public class MyArrays {
    static int counter;
    static int sum;
    static int summer;
    static int odd(int[] arr){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>0 && arr[i]%2 == 0){
                counter++;
            }
        }
        return counter;
    }
    static int above(int[] arr){

        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>sum/arr.length){
                summer +=arr[i];
            }
        }
        return summer;
    }
}
