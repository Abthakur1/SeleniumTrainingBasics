//Searching an element in an array
package arrays;

public class Searching {
    public static void main(String[] args) {
        int arr[] = {20,90,67,56,43,98,45,69,55,19,42};
        int searchValue = 45;
//        int searchValue = 46;
        boolean flag = false;
        for(int i =0 ; i< arr.length;i++){
            if(arr[i] == searchValue ){
                flag = true;  // when value is matched/ searched
                System.out.println("searched value is found at index:"+ i);
                break; // it is used to come out of the loop , loop ends here
            }
        }

        if(flag) {
            System.out.println("Searched value is present in the array");
        } else {
            System.out.println("Searched value is not present in the array");
        }
    }
}
