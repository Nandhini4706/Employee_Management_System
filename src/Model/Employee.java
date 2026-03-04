package Model;

public class Employee {
    private int id;
    private String name;
    private String age;
    private String department;
    private String designation;
    private String reportingTo;

    public Employee(int id, String name, String age, String department, String designation, String reportingTo) {
        this.id = id;
        this.name=name;
        this.age=age;
        this.department=department;
        this.designation=designation;
        this.reportingTo=reportingTo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }
    public String getDesignation(){
        return designation;
    }
    public String getReportingTo(){
        return reportingTo;
    }
    public void display(){
        System.out.println("------------------------------------------------------");
        System.out.println("Name" +getName());
        System.out.println("Age" +getAge());
        System.out.println("Department " +getDepartment());
        System.out.println("Designation " +getDesignation());
        System.out.println("Reporting To " +getReportingTo());
        System.out.println("-------------------------------------------------------");
    }
}
