package arrays;

public class Basics {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 70;
       // marks[1] = "70";  // not allowed
        marks[1] = 80;
        marks[2] = 50;
        marks[3] = 54;
        marks[4] = 60;
//        marks[5] = 75;  // not allowed , ArrayIndexOutOfBoundsException

        System.out.println(marks); // hashcode() , method of Object.
        for(int i =0; i < marks.length; i++) {
            System.out.println(marks[i]); // marks[0] , marks[1]
        }

        int[] marks1 =  {50,43,69,67,90};
        System.out.println(marks1[3]); //67
    }
}
