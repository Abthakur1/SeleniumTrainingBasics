package oopsPrinciples;

public class Employee {

    // instance variables, class variables
    private String name;
    private String companyName;
    private int salary;
    public String designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;  // this --> it is used to access the instance variable / intialize instance variable
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
