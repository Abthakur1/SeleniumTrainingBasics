package oopsPrinciples;

public class Student extends Person {

    public String stream;
    public int rollNum;

    public void displayChild() {
        System.out.println("child class method");
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.showPerson();
        st.displayChild();

    }


}
