package oopsPrinciples;

public class TestEmployee {

    public static void main(String[] args) {

        Employee empObj = new Employee();  // interview
        empObj.setName("Abhishek");
        empObj.setCompanyName("ABC");
        empObj.setDesignation("Trainee");
        System.out.println(empObj.getName());
        System.out.println(empObj.getCompanyName());
        System.out.println(empObj.getDesignation());

    }
}
