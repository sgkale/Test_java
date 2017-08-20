import java.util.*;
class Employee{

    private int empId;
    private String name;
    private int salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    Employee(){
        System.out.println("Default constructor called");
        this.empId=0;
        this.name="";
        this.salary=0;

    }
    Employee(int empId){
        System.out.println("Parameterised constructor called");
        this.empId=empId;
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee details are");
        System.out.println("Name :- "+name+"\nEmp Id :- "+empId+"\nSalary :- "+salary);
    }

    public void acceptEmployeeDetails(int salary1){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        this.name=sc.next();
        this.salary=salary1;

    }

}
public class Assignment_2_types_of_encapsulation {
    public static void main(String[] args){
        Employee[] emp= new Employee[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){

            // WAY 1
            /*
            emp[i]=new Employee(i);
            emp[i].acceptEmployeeDetails(100);
            */

            // way 2
            emp[i].setEmpId(sc.nextInt());
            emp[i].setName(sc.next());
            emp[i].setSalary(sc.nextInt());

        }
        for(int i=0;i<5;i++){
            // way 1
            /*
            emp[i].displayEmployeeDetails();
            */
            // way 2
            System.out.println(emp[i].getEmpId());
            System.out.println(emp[i].getName());
            System.out.println(emp[i].getSalary());
        }


    }
}
