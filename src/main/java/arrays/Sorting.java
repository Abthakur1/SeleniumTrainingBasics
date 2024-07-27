package arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = {59, 30, 67, 80,10, 58,60};
        int temp;
        for(int i =0 ; i< arr.length; i++) {
            for(int j = i+1 ; j < arr.length; j++) {
                if(arr[j]< arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];     // swapping
                    arr[j] = temp;
                }
            }
        }

        for( int i =0; i< arr.length;i++){
            System.out.println(arr[i]);  // sorted
        }
    }
}
