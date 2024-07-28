package arrays;

public class MaxMin {
    public static void main(String[] args) {
        int arr[] = {20,90,67,56,43,98,45,69,55,19,42};
        int max = arr[0]; // initialize
        int min = arr[0]; // initialize
        for(int i =0 ; i< arr.length;i++) {
            if(arr[i]> max){
                max = arr[i];
            } else if(arr[i]< min){
                min = arr[i];
            }
        }

        System.out.println("Maximum value in array:"+ max);
        System.out.println("Minimum value in array:"+ min);
    }
}
