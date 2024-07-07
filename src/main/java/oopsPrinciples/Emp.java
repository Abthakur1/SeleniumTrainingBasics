package oopsPrinciples;

public class Emp {

    String empName;
    String empDesignation;
    double salary;

    Emp (String n, String des, double sal) {    // parameterised constructor

        this.empName = n;
        this.empDesignation = des;
        this.salary = sal;

    }

    public static void main(String[] args) {
        Emp obj = new Emp("vineet", "analyst", 1000);  //
        System.out.println(obj.empName);
        System.out.println(obj.empDesignation);
        System.out.println(obj.salary);

        Emp obj1 = new Emp("sumit", "analyst1", 2000);
        System.out.println(obj1.empName);
        System.out.println(obj1.empDesignation);
        System.out.println(obj1.salary);
    }
}
